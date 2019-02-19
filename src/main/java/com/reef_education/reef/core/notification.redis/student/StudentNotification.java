/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student;

/**
 * Constants used by Notification Service.
 */
public class StudentNotification
{
    public static final String REDIS_CHANNEL_NAME = "reef:student-notifications";

    /**
     * These event names are designed to mimic the legacy WebSockets resources
     */
    public static final String ACTION_END_CLASS_SESSION = "endSession";
    public static final String ACTION_END_QUIZ_SESSION = "endQuiz";
    public static final String ACTION_ADD_ATTACHMENT = "addAttachment";
    public static final String ACTION_ATTENDANCE_SESSION_CREATE = "attendanceSessionCreate";
    public static final String ACTION_ATTENDANCE_SESSION_END = "attendanceSessionEnd";
    public static final String ACTION_END_QUESTION = "endQuestion";
    public static final String ACTION_QUESTION_CREATE = "question";
    public static final String ACTION_QUIZ_START = "startQuiz";
    public static final String ACTION_UPDATE_QUESTION = "update";
    public static final String ACTION_UPDATE_TARGET_GRADING = "targetUpdate";

    private StudentNotification()
    {
    }
}
