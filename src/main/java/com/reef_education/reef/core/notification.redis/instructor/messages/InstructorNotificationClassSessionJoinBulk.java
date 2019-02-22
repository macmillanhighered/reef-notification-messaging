/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.instructor.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotification;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotificationBase;
import com.reef_education.reef.socket.events.ClassSessionBulkJoinEvent;

import java.util.List;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InstructorNotificationClassSessionJoinBulk extends InstructorNotificationBase
{
    private List<ClassSessionBulkJoinEvent> classSessionBulkJoinEventList;

    public InstructorNotificationClassSessionJoinBulk()
    {
        this.action = InstructorNotification.ACTION_CLASS_SESSION_JOIN;
    }

    public InstructorNotificationClassSessionJoinBulk(List<ClassSessionBulkJoinEvent> classSessionBulkJoinEventList)
    {
        this();

        if (classSessionBulkJoinEventList == null)
        {
            throw new IllegalArgumentException("classSessionBulkJoinEventList cannot be null");
        }

        this.classSessionBulkJoinEventList = classSessionBulkJoinEventList;
    }

    public List<ClassSessionBulkJoinEvent> getClassSessionBulkJoinEventList()
    {
        return classSessionBulkJoinEventList;
    }

    public void setClassSessionBulkJoinEventList(List<ClassSessionBulkJoinEvent> classSessionBulkJoinEventList)
    {
        this.classSessionBulkJoinEventList = classSessionBulkJoinEventList;
    }
}
