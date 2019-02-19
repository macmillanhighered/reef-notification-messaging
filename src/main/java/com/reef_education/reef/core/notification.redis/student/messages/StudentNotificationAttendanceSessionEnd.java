/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;
import com.reef_education.reef.core.notification.redis.student.StudentNotificationBase;
import com.reef_education.reef.data.AttendanceData;
import com.reef_education.reef.socket.events.AttendanceSessionEndEvent;

import java.util.UUID;

/**
 * Designed to mimic the WebSockets resource "attendanceSessionEnd"
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudentNotificationAttendanceSessionEnd extends StudentNotificationBase
{
    private UUID attendanceId;
    private UUID courseId;

    public StudentNotificationAttendanceSessionEnd()
    {
        this.action = StudentNotification.ACTION_ATTENDANCE_SESSION_END;
    }

    public StudentNotificationAttendanceSessionEnd(AttendanceSessionEndEvent attendanceSessionEndEvent, UUID courseId)
    {
        this();

        if (attendanceSessionEndEvent == null)
        {
            throw new IllegalArgumentException("attendanceSessionEndEvent cannot be null");
        }

        if (courseId == null)
        {
            throw new IllegalArgumentException("courseId cannot be null");
        }

        AttendanceData attendanceSession = attendanceSessionEndEvent.getAttendanceSession();

        if (attendanceSession != null)
        {
            this.attendanceId = attendanceSession.getId();
        }

        this.courseId = courseId;
    }

    /**
     * Returns the attendanceId for this event adapter.
     *
     * @return the attendanceId
     */
    public UUID getAttendanceId()
    {
        return attendanceId;
    }

    /**
     * Sets the attendanceId for this event adapter.
     *
     * @param attendanceId the attendanceId to set
     */
    public void setAttendanceId(UUID attendanceId)
    {
        this.attendanceId = attendanceId;
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }
}
