
package com.conference.api.documents;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "questionId",
    "answerValue"
})
public class QuestionAnswer {

    @JsonProperty("questionId")
    private Integer questionId;
    @JsonProperty("answerValue")
    private String answerValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("questionId")
    public Integer getQuestionId() {
        return questionId;
    }

    @JsonProperty("questionId")
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @JsonProperty("answerValue")
    public String getAnswerValue() {
        return answerValue;
    }

    @JsonProperty("answerValue")
    public void setAnswerValue(String answerValue) {
        this.answerValue = answerValue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
