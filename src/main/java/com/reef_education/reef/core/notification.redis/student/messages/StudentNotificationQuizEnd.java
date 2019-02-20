/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;
import com.reef_education.reef.core.notification.redis.student.StudentNotificationBase;

import java.util.UUID;

/**
 * Designed to mimic the WebSockets resource "endQuiz".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudentNotificationQuizEnd extends StudentNotificationBase
{
    private UUID courseId;

    public StudentNotificationQuizEnd()
    {
        this.action = StudentNotification.ACTION_END_QUIZ_SESSION;
    }

    public StudentNotificationQuizEnd(UUID courseId)
    {
        this();

        if (courseId == null)
        {
            throw new IllegalArgumentException("courseId cannot be null");
        }

        this.courseId = courseId;
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
