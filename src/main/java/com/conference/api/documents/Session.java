
package com.conference.api.documents;

import java.util.HashMap;
import java.util.List;
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
    "title",
    "description",
    "isServiceSession",
    "isPlenumSession",
    "speakers",
    "categoryItems",
    "questionAnswers",
    "roomId",
    "englishTitle",
    "videoUrl",
    "slideUrl",
    "interpretationTarget",
    "message",
    "sessionType",
    "forBeginners"
})
@Document
public class Session {

    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isServiceSession")
    private Boolean isServiceSession;
    @JsonProperty("isPlenumSession")
    private Boolean isPlenumSession;
    @JsonProperty("speakers")
    private List<String> speakers = null;
    @JsonProperty("categoryItems")
    private List<String> categoryItems = null;
    @JsonProperty("questionAnswers")
    private List<QuestionAnswer> questionAnswers = null;
    @JsonProperty("roomId")
    private Integer roomId;
    @JsonProperty("englishTitle")
    private String englishTitle;
    @JsonProperty("videoUrl")
    private String videoUrl;
    @JsonProperty("slideUrl")
    private String slideUrl;
    @JsonProperty("interpretationTarget")
    private Boolean interpretationTarget;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("sessionType")
    private String sessionType;
    @JsonProperty("forBeginners")
    private Boolean forBeginners;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isServiceSession")
    public Boolean getIsServiceSession() {
        return isServiceSession;
    }

    @JsonProperty("isServiceSession")
    public void setIsServiceSession(Boolean isServiceSession) {
        this.isServiceSession = isServiceSession;
    }

    @JsonProperty("isPlenumSession")
    public Boolean getIsPlenumSession() {
        return isPlenumSession;
    }

    @JsonProperty("isPlenumSession")
    public void setIsPlenumSession(Boolean isPlenumSession) {
        this.isPlenumSession = isPlenumSession;
    }

    @JsonProperty("speakers")
    public List<String> getSpeakers() {
        return speakers;
    }

    @JsonProperty("speakers")
    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    @JsonProperty("categoryItems")
    public List<String> getCategoryItems() {
        return categoryItems;
    }

    @JsonProperty("categoryItems")
    public void setCategoryItems(List<String> categoryItems) {
        this.categoryItems = categoryItems;
    }

    @JsonProperty("questionAnswers")
    public List<QuestionAnswer> getQuestionAnswers() {
        return questionAnswers;
    }

    @JsonProperty("questionAnswers")
    public void setQuestionAnswers(List<QuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    @JsonProperty("roomId")
    public Integer getRoomId() {
        return roomId;
    }

    @JsonProperty("roomId")
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @JsonProperty("englishTitle")
    public String getEnglishTitle() {
        return englishTitle;
    }

    @JsonProperty("englishTitle")
    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    @JsonProperty("videoUrl")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("videoUrl")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("slideUrl")
    public String getSlideUrl() {
        return slideUrl;
    }

    @JsonProperty("slideUrl")
    public void setSlideUrl(String slideUrl) {
        this.slideUrl = slideUrl;
    }

    @JsonProperty("interpretationTarget")
    public Boolean getInterpretationTarget() {
        return interpretationTarget;
    }

    @JsonProperty("interpretationTarget")
    public void setInterpretationTarget(Boolean interpretationTarget) {
        this.interpretationTarget = interpretationTarget;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("sessionType")
    public String getSessionType() {
        return sessionType;
    }

    @JsonProperty("sessionType")
    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    @JsonProperty("forBeginners")
    public Boolean getForBeginners() {
        return forBeginners;
    }

    @JsonProperty("forBeginners")
    public void setForBeginners(Boolean forBeginners) {
        this.forBeginners = forBeginners;
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
