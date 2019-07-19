/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.instructor.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotification;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotificationBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InstructorNotificationRosterSyncComplete extends InstructorNotificationBase
{
    private String jobId;

    public InstructorNotificationRosterSyncComplete()
    {
        this.action = InstructorNotification.ACTION_ROSTER_SYNC_COMPLETE;
    }

    public InstructorNotificationRosterSyncComplete(String jobId)
    {
        this();

        if (jobId == null)
        {
            throw new IllegalArgumentException("jobId cannot be null");
        }

        this.jobId = jobId;
    }

    public String getJobId()
    {
        return jobId;
    }

    public void setJobId(String jobId)
    {
        this.jobId = jobId;
    }
}
