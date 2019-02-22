/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.instructor.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotification;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotificationBase;
import com.reef_education.reef.socket.events.ClassSessionBulkLeaveEvent;

import java.util.List;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InstructorNotificationClassSessionLeaveBulk extends InstructorNotificationBase
{
    private List<ClassSessionBulkLeaveEvent> classSessionBulkLeaveEventList;

    public InstructorNotificationClassSessionLeaveBulk()
    {
        this.action = InstructorNotification.ACTION_CLASS_SESSION_LEAVE;
    }

    public InstructorNotificationClassSessionLeaveBulk(List<ClassSessionBulkLeaveEvent> classSessionBulkLeaveEventList)
    {
        this();

        if (classSessionBulkLeaveEventList == null)
        {
            throw new IllegalArgumentException("classSessionBulkLeaveEventList cannot be null");
        }

        this.classSessionBulkLeaveEventList = classSessionBulkLeaveEventList;
    }

    public List<ClassSessionBulkLeaveEvent> getClassSessionBulkLeaveEventList()
    {
        return classSessionBulkLeaveEventList;
    }

    public void setClassSessionBulkLeaveEventList(List<ClassSessionBulkLeaveEvent> classSessionBulkLeaveEventList)
    {
        this.classSessionBulkLeaveEventList = classSessionBulkLeaveEventList;
    }
}
