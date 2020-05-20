/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotification;
import com.reef_education.reef.core.notification.redis.student.StudentNotificationBase;
import com.reef_education.reef.socket.events.AddAttachmentEvent;

import java.util.UUID;

/**
 * Designed to mimic the WebSockets resource "addAttachment".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudentNotificationAddAttachment extends StudentNotificationBase
{
    private UUID questionId;
    private UUID attachmentId;
    private String imageURL;
    private String smallImageURL;
    private String largeImageURL;
    private UUID courseId;

    public StudentNotificationAddAttachment()
    {
        this.action = StudentNotification.ACTION_ADD_ATTACHMENT;
    }

    public StudentNotificationAddAttachment(AddAttachmentEvent addAttachmentEvent,
                                            UUID courseId,
                                            String smallImageUrl,
                                            String largeImageUrl)
    {
        this();

        if (addAttachmentEvent == null)
        {
            throw new IllegalArgumentException("addAttachmentEvent cannot be null");
        }

        if (courseId == null)
        {
            throw new IllegalArgumentException("courseId cannot be null");
        }

        this.questionId = addAttachmentEvent.getQuestionId();
        this.attachmentId = addAttachmentEvent.getAttachmentId();
        this.imageURL = addAttachmentEvent.getImageURL();
        this.smallImageURL = smallImageUrl;
        this.largeImageURL = largeImageUrl;
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

    public UUID getAttachmentId()
    {
        return attachmentId;
    }

    public void setAttachmentId(UUID attachmentId)
    {
        this.attachmentId = attachmentId;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }

    public String getSmallImageURL()
    {
        return smallImageURL;
    }

    public void setSmallImageURL(String smallImageURL)
    {
        this.smallImageURL = smallImageURL;
    }

    public String getLargeImageURL()
    {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL)
    {
        this.largeImageURL = largeImageURL;
    }
}
