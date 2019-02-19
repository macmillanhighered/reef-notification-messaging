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
import com.reef_education.reef.socket.events.AttendanceSessionCreateEvent;

import java.util.UUID;

/**
 * Designed to mimic the WebSockets resource "attendanceSessionCreate".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudentNotificationAttendanceSessionCreate extends StudentNotificationBase
{
    private UUID attendanceId;
    private UUID courseId;

    public StudentNotificationAttendanceSessionCreate()
    {
        this.action = StudentNotification.ACTION_ATTENDANCE_SESSION_CREATE;
    }

    public StudentNotificationAttendanceSessionCreate(AttendanceSessionCreateEvent attendanceSessionCreateEvent, UUID courseId)
    {
        this();
        if (attendanceSessionCreateEvent == null)
        {
            throw new IllegalArgumentException("Event cannot be null");
        }

        AttendanceData attendanceSession = attendanceSessionCreateEvent.getAttendanceSession();

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
