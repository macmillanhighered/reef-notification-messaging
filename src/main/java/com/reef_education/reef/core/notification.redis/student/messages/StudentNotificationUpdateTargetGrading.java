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
 * Designed to mimic the WebSockets resource "targetUpdate".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudentNotificationUpdateTargetGrading extends StudentNotificationBase
{
    private UUID courseId;
    private UUID questionId;

    // TargetDataResponseDataV1
    private Object targetData;

    public StudentNotificationUpdateTargetGrading()
    {
        this.action = StudentNotification.ACTION_UPDATE_TARGET_GRADING;
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }

    public UUID getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(UUID questionId)
    {
        this.questionId = questionId;
    }

    public Object getTargetData()
    {
        return targetData;
    }

    public void setTargetData(Object targetData)
    {
        this.targetData = targetData;
    }
}
