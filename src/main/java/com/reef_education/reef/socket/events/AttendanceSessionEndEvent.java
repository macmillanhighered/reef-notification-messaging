/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import com.reef_education.reef.data.AttendanceData;

public class AttendanceSessionEndEvent
{
	private AttendanceData attendanceSession;


	public AttendanceSessionEndEvent()
	{
	}

	public AttendanceSessionEndEvent(AttendanceData attendanceSession)
	{
		this.attendanceSession = attendanceSession;
	}


	/**
	 * Returns the attendanceSession for this event.
	 *
	 * @return the attendanceSession
	 */
	public AttendanceData getAttendanceSession()
	{
		return attendanceSession;
	}

	/**
	 * Sets the attendanceSession for this event.
	 *
	 * @param attendanceSession the attendanceSession to set
	 */
	public void setAttendanceSession(AttendanceData attendanceSession)
	{
		this.attendanceSession = attendanceSession;
	}

}
