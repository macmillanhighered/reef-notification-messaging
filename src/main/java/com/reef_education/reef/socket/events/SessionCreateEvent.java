/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import com.reef_education.reef.data.SessionData;

public class SessionCreateEvent
{
	private SessionData sessionData;

	public SessionCreateEvent(SessionData sessionData)
	{
		this.sessionData = sessionData;
	}

	public SessionCreateEvent()
	{
	}

	public SessionData getSessionData()
	{
		return sessionData;
	}

	public void setSessionData(SessionData sessionData)
	{
		this.sessionData = sessionData;
	}

}
