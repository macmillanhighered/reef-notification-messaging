/**
 * Copyright (C) © 2013-2018 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.socket.events;

import com.reef_education.reef.data.QuestionData;
import com.reef_education.reef.data.TargetGradedResultsData;

public class EndQuestionEvent
{
	private QuestionData question;
	private TargetGradedResultsData targetGradedResults;


	public EndQuestionEvent(QuestionData question)
	{
		this.question = question;
	}

	public EndQuestionEvent(QuestionData question, TargetGradedResultsData targetGradedResults)
	{
		this.question = question;
		this.targetGradedResults = targetGradedResults;
	}

	public EndQuestionEvent()
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

	public TargetGradedResultsData getTargetGradedResults()
	{
		return targetGradedResults;
	}

	public void setTargetGradedResults(TargetGradedResultsData targetGradedResults)
	{
		this.targetGradedResults = targetGradedResults;
	}

}
