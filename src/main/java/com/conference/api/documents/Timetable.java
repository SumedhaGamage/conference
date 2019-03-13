
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sessions",
    "speakers",
    "questions",
    "categories",
    "rooms"
})
public class Timetable {

    @JsonProperty("sessions")
    private List<Session> sessions = null;
    @JsonProperty("speakers")
    private List<Speaker> speakers = null;
    @JsonProperty("questions")
    private List<Question> questions = null;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("rooms")
    private List<Room> rooms = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Timetable(){
        /** for jackson */
    }

    public Timetable(List<Session> sessions, List<Speaker> speakers, List<Question> questions,
                    List<Category> categories, List<Room> rooms){
                        this.sessions = sessions;
                        this.speakers = speakers;
                        this.questions = questions;
                        this.categories = categories;
                        this.rooms = rooms;

    }
    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @JsonProperty("speakers")
    public List<Speaker> getSpeakers() {
        return speakers;
    }

    @JsonProperty("speakers")
    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @JsonProperty("questions")
    public List<Question> getQuestions() {
        return questions;
    }

    @JsonProperty("questions")
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("rooms")
    public List<Room> getRooms() {
        return rooms;
    }

    @JsonProperty("rooms")
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
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
