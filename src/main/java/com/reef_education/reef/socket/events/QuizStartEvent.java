/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import com.reef_education.reef.data.QuestionData;

import java.util.List;


public class QuizStartEvent
{
	private List<QuestionData> questions;

	public QuizStartEvent(List<QuestionData> questions)
	{
		this.questions = questions;
	}

	public QuizStartEvent()
	{
	}

	public List<QuestionData> getQuestions()
	{
		return questions;
	}

	public void setQuestions(List<QuestionData> questions)
	{
		this.questions = questions;
	}

}
