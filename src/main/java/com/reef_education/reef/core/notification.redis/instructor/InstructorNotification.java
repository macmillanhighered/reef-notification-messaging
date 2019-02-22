/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.instructor;

/**
 * Constants used by Notification Service.
 */
public class InstructorNotification
{
    public static final String REDIS_CHANNEL_NAME = "reef:instructor-notifications";
    public static final String REDIS_LEGACY_CHANNEL_NAME = "reef:legacy-instructor-notifications";

    public static final String ACTION_CLASS_SESSION_JOIN = "sessionJoin";
    public static final String ACTION_CLASS_SESSION_LEAVE = "sessionLeave";

    private InstructorNotification()
    {
    }
}
