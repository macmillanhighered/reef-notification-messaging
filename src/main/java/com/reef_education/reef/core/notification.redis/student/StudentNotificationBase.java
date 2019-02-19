/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.reef_education.util.json.JsonUtil;

/**
 * Base object for Notification Service notifications
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentNotificationBase
{
    protected String action;

    /**
     * @return the action
     */
    public String getAction()
    {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action)
    {
        this.action = action;
    }

    public String toJson()
    {
        return JsonUtil.toJsonSafe(this, false);
    }
}
