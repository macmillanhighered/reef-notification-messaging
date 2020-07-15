package com.reef_education.reef.core.notification.redis.instructor.messages;

import com.reef_education.reef.core.AnswerTypeMa;
import com.reef_education.reef.core.notification.redis.instructor.InstructorNotificationBase;

import java.util.UUID;

/*

activity = ActivityDB().get_activity_by_id(activity_id)
activity_type = activity.get("activityType")

if activity_type != "ASSIGNMENT":
    question = QuestionDB().get_question(question_id)
    answer_type = question.get("answerType")
    event_body = {
        "answerType": answer_type,
        "questionId": str(question_id)
    }

    course_id = activity.get('courseId')
    channel = f"""private-{course_id}"""
    pusher_client = Pusher(PUSHER_CLIENT_KEYS)
    pusher_client.publish_message_to_channel(channel, 'answer', event_body)

 */

public class InstructorNotificationAnswerEventMessage extends InstructorNotificationBase
{
    private AnswerTypeMa answerType;
    private UUID questionId;
    private UUID courseId;

    public AnswerTypeMa getAnswerType()
    {
        return answerType;
    }

    public void setAnswerType(AnswerTypeMa answerType)
    {
        this.answerType = answerType;
    }

    public UUID getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(UUID questionId)
    {
        this.questionId = questionId;
    }

    public UUID getCourseId()
    {
        return courseId;
    }

    public void setCourseId(UUID courseId)
    {
        this.courseId = courseId;
    }
}
