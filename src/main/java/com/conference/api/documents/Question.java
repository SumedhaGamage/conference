
package com.conference.api.documents;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "question",
    "questionType",
    "sort",
    "translatedQuestion"
})
@Document
public class Question {

    @Id
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("question")
    private String question;
    @JsonProperty("questionType")
    private String questionType;
    @JsonProperty("sort")
    private Integer sort;
    @JsonProperty("translatedQuestion")
    private TranslatedQuestion translatedQuestion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty("questionType")
    public String getQuestionType() {
        return questionType;
    }

    @JsonProperty("questionType")
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @JsonProperty("sort")
    public Integer getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @JsonProperty("translatedQuestion")
    public TranslatedQuestion getTranslatedQuestion() {
        return translatedQuestion;
    }

    @JsonProperty("translatedQuestion")
    public void setTranslatedQuestion(TranslatedQuestion translatedQuestion) {
        this.translatedQuestion = translatedQuestion;
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
