/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;

/**
 * Designed to mimic the WebSockets resource "endQuestion"
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentNotificationEndQuestion extends StudentNotificationQuestionBase
{
    public StudentNotificationEndQuestion()
    {
        this.action = StudentNotification.ACTION_END_QUESTION;
    }
}
