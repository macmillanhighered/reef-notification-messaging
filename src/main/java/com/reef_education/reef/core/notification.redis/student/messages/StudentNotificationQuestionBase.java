/**
 * Copyright (C) © 2013-2019 Macmillan Learning. All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.reef_education.reef.core.notification.redis.student.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.reef_education.reef.core.notification.redis.student.StudentNotificationBase;
import com.reef_education.util.json.JsonUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Base Question action object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentNotificationQuestionBase extends StudentNotificationBase
{
    private UUID courseId;
    private UUID id;
    private UUID sessionId;
    private long questionNumber;
    private int questionType;
    private boolean anonymous = false;
    private boolean correctAnswerOther = false;
    private boolean bestCorrectAnswerOther;
    private String correctAnswerOtherResponse;
    private List<Object> correctAnswerData;
    private List<String> bestCorrectAnswerResponse;
    private boolean screenshotViewable = true;
    private boolean resultsViewable = true;
    private List<String> attachments;
    private int hasThumbnails = 0;
    private Date dateAdded;
    private Date endDate;
    private Date deletedDate;
    private int answerLengthLimit;
    private int answerSignificant;

    // Map<String, QuestionAnswerBucket>
    private Map<String, Object> questionAnswerBuckets;

    // List<AnswerScoringData>
    private List<Object> answerScoring;

    // QuestionScoreSettingsData
    private Object scoreSettings;

    private float maxPointsPossible = 0f;
    private String instructorFeedback;
    private String imageURL;
    private String thumbSmallURL;
    private String thumbLargeURL;

    // TargetDataResponseDataV1
    private Object targetData;

    public StudentNotificationQuestionBase()
    {
    }

    public String toJson()
    {
        return JsonUtil.toJsonSafe(this, false);
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public UUID getSessionId()
    {
        return sessionId;
    }

    public void setSessionId(UUID sessionId)
    {
        this.sessionId = sessionId;
    }

    public long getQuestionNumber()
    {
        return questionNumber;
    }

    public void setQuestionNumber(long questionNumber)
    {
        this.questionNumber = questionNumber;
    }

    public int getQuestionType()
    {
        return questionType;
    }

    public void setQuestionType(int questionType)
    {
        this.questionType = questionType;
    }

    public boolean isAnonymous()
    {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous)
    {
        this.anonymous = anonymous;
    }

    public boolean isCorrectAnswerOther()
    {
        return correctAnswerOther;
    }

    public void setCorrectAnswerOther(boolean correctAnswerOther)
    {
        this.correctAnswerOther = correctAnswerOther;
    }

    public boolean isBestCorrectAnswerOther()
    {
        return bestCorrectAnswerOther;
    }

    public void setBestCorrectAnswerOther(boolean bestCorrectAnswerOther)
    {
        this.bestCorrectAnswerOther = bestCorrectAnswerOther;
    }

    public String getCorrectAnswerOtherResponse()
    {
        return correctAnswerOtherResponse;
    }

    public void setCorrectAnswerOtherResponse(String correctAnswerOtherResponse)
    {
        this.correctAnswerOtherResponse = correctAnswerOtherResponse;
    }

    public List<Object> getCorrectAnswerData()
    {
        return correctAnswerData;
    }

    public void setCorrectAnswerData(List<Object> correctAnswerData)
    {
        this.correctAnswerData = correctAnswerData;
    }

    public List<String> getBestCorrectAnswerResponse()
    {
        return bestCorrectAnswerResponse;
    }

    public void setBestCorrectAnswerResponse(List<String> bestCorrectAnswerResponse)
    {
        this.bestCorrectAnswerResponse = bestCorrectAnswerResponse;
    }

    public boolean isScreenshotViewable()
    {
        return screenshotViewable;
    }

    public void setScreenshotViewable(boolean screenshotViewable)
    {
        this.screenshotViewable = screenshotViewable;
    }

    public boolean isResultsViewable()
    {
        return resultsViewable;
    }

    public void setResultsViewable(boolean resultsViewable)
    {
        this.resultsViewable = resultsViewable;
    }

    public List<String> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(List<String> attachments)
    {
        this.attachments = attachments;
    }

    public int getHasThumbnails()
    {
        return hasThumbnails;
    }

    public void setHasThumbnails(int hasThumbnails)
    {
        this.hasThumbnails = hasThumbnails;
    }

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded)
    {
        this.dateAdded = dateAdded;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Date getDeletedDate()
    {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate)
    {
        this.deletedDate = deletedDate;
    }

    public int getAnswerLengthLimit()
    {
        return answerLengthLimit;
    }

    public void setAnswerLengthLimit(int answerLengthLimit)
    {
        this.answerLengthLimit = answerLengthLimit;
    }

    public int getAnswerSignificant()
    {
        return answerSignificant;
    }

    public void setAnswerSignificant(int answerSignificant)
    {
        this.answerSignificant = answerSignificant;
    }

    public Map<String, Object> getQuestionAnswerBuckets()
    {
        return questionAnswerBuckets;
    }

    public void setQuestionAnswerBuckets(Map<String, Object> questionAnswerBuckets)
    {
        this.questionAnswerBuckets = questionAnswerBuckets;
    }

    public List<Object> getAnswerScoring()
    {
        return answerScoring;
    }

    public void setAnswerScoring(List<Object> answerScoring)
    {
        this.answerScoring = answerScoring;
    }

    public Object getScoreSettings()
    {
        return scoreSettings;
    }

    public void setScoreSettings(Object scoreSettings)
    {
        this.scoreSettings = scoreSettings;
    }

    public float getMaxPointsPossible()
    {
        return maxPointsPossible;
    }

    public void setMaxPointsPossible(float maxPointsPossible)
    {
        this.maxPointsPossible = maxPointsPossible;
    }

    public String getInstructorFeedback()
    {
        return instructorFeedback;
    }

    public void setInstructorFeedback(String instructorFeedback)
    {
        this.instructorFeedback = instructorFeedback;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }

    public String getThumbSmallURL()
    {
        return thumbSmallURL;
    }

    public void setThumbSmallURL(String thumbSmallURL)
    {
        this.thumbSmallURL = thumbSmallURL;
    }

    public String getThumbLargeURL()
    {
        return thumbLargeURL;
    }

    public void setThumbLargeURL(String thumbLargeURL)
    {
        this.thumbLargeURL = thumbLargeURL;
    }

    public Object getTargetData()
    {
        return targetData;
    }

    public void setTargetData(Object targetData)
    {
        this.targetData = targetData;
    }
}
