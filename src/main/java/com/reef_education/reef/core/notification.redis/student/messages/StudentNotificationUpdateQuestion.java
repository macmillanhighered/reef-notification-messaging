/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;

/**
 * Designed to mimic the WebSockets resource "update".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentNotificationUpdateQuestion extends StudentNotificationQuestionBase
{
    public StudentNotificationUpdateQuestion()
    {
        this.action = StudentNotification.ACTION_UPDATE_QUESTION;
    }

    public StudentNotificationUpdateQuestion(StudentNotificationQuestionBase base)
    {
        super(base);
        this.action = StudentNotification.ACTION_UPDATE_QUESTION;
    }
}
