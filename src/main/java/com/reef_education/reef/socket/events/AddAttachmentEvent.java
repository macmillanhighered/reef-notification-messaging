/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import java.util.UUID;

public class AddAttachmentEvent
{
	private UUID questionId;
	private UUID attachmentId;
	private String imageURL;

	public AddAttachmentEvent(UUID questionId, UUID attachmentId, String imageURL)
	{
		this.questionId = questionId;
		this.attachmentId = attachmentId;
		this.imageURL = imageURL;
	}

	public AddAttachmentEvent()
	{
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

}
