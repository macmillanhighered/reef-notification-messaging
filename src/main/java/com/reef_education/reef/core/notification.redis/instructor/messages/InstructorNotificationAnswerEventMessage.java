/**
 * Copyright (C) © 2013-2020 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.instructor.messages;

import com.reef_education.reef.core.AnswerType;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotificationBase;

import java.util.UUID;

public class InstructorNotificationAnswerEventMessage extends InstructorNotificationBase
{
    private AnswerType answerType;
    private UUID questionId;
    private UUID courseId;

    public InstructorNotificationAnswerEventMessage()
    {
    }

    public InstructorNotificationAnswerEventMessage(
            AnswerType answerType,
            UUID questionId,
            UUID courseId
    )
    {
        this.answerType = answerType;
        this.questionId = questionId;
        this.courseId = courseId;
    }

    public AnswerType getAnswerType()
    {
        return answerType;
    }

    public void setAnswerType(AnswerType answerType)
    {
        this.answerType = answerType;
    }

    public UUID getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(UUID questionId)
    {
        this.questionId = questionId;
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
