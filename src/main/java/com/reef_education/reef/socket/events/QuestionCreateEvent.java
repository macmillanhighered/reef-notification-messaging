/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import com.reef_education.reef.data.QuestionData;

public class QuestionCreateEvent
{
	private QuestionData question;

	public QuestionCreateEvent(QuestionData question)
	{
		this.question = question;
	}

	public QuestionCreateEvent()
	{
	}

	public QuestionData getQuestion()
	{
		return question;
	}

	public void setQuestion(QuestionData question)
	{
		this.question = question;
	}

}
