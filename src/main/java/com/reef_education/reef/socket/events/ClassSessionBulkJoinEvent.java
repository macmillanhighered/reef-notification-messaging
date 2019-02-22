/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import java.util.List;
import java.util.UUID;

public class ClassSessionBulkJoinEvent
{
	private UUID courseId;
	private List<UUID> userIdList;

	public ClassSessionBulkJoinEvent(UUID courseId, List<UUID> userIdList)
	{
		this.courseId = courseId;
		this.userIdList = userIdList;
	}

	public ClassSessionBulkJoinEvent()
	{
	}

	public UUID getCourseId()
	{
		return courseId;
	}

	public void setCourseId(UUID courseId)
	{
		this.courseId = courseId;
	}

	public List<UUID> getUserIdList()
	{
		return userIdList;
	}

	public void setUserIdList(List<UUID> userIdList)
	{
		this.userIdList = userIdList;
	}
}
