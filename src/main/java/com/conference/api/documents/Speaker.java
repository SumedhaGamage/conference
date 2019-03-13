
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
    "firstName",
    "lastName",
    "fullName",
    "bio",
    "tagLine",
    "profilePicture",
    "isTopSpeaker",
    "links",
    "sessions"
})
@Document
public class Speaker {

    @Id
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("tagLine")
    private String tagLine;
    @JsonProperty("profilePicture")
    private String profilePicture;
    @JsonProperty("isTopSpeaker")
    private Boolean isTopSpeaker;
    @JsonProperty("links")
    private List<String> links = null;
    @JsonProperty("sessions")
    private List<Integer> sessions = null;
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

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("tagLine")
    public String getTagLine() {
        return tagLine;
    }

    @JsonProperty("tagLine")
    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    @JsonProperty("profilePicture")
    public String getProfilePicture() {
        return profilePicture;
    }

    @JsonProperty("profilePicture")
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @JsonProperty("isTopSpeaker")
    public Boolean getIsTopSpeaker() {
        return isTopSpeaker;
    }

    @JsonProperty("isTopSpeaker")
    public void setIsTopSpeaker(Boolean isTopSpeaker) {
        this.isTopSpeaker = isTopSpeaker;
    }

    @JsonProperty("links")
    public List<String> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<String> links) {
        this.links = links;
    }

    @JsonProperty("sessions")
    public List<Integer> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Integer> sessions) {
        this.sessions = sessions;
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
