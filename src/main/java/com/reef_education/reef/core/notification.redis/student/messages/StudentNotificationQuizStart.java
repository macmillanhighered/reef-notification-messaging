/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;
import com.reef_education.reef.core.notification.redis.student.StudentNotificationBase;

import java.util.List;
import java.util.UUID;

/**
 * Designed to mimic the WebSockets resource "startQuiz".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentNotificationQuizStart extends StudentNotificationBase
{
    private UUID courseId;
    private String quizName;

    // List<QuestionResponseDataV8>
    private List<Object> questionList;

    public StudentNotificationQuizStart()
    {
        this.action = StudentNotification.ACTION_QUIZ_START;
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }

    public String getQuizName()
    {
        return quizName;
    }

    public void setQuizName(String quizName)
    {
        this.quizName = quizName;
    }

    public List<Object> getQuestionList()
    {
        return questionList;
    }

    public void setQuestionList(List<Object> questionList)
    {
        this.questionList = questionList;
    }
}
