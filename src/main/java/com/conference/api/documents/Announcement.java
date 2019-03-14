package com.conference.api.documents;

/**
 * Announcements
 */
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
"title",
"content",
"type",
"publishedAt",
"lang"
})

@Document
public class Announcement {

@Id
@JsonProperty("id")
private String id;
@JsonProperty("title")
private String title;
@JsonProperty("content")
private String content;
@JsonProperty("type")
private String type;
@JsonProperty("publishedAt")
private String publishedAt;
@JsonProperty("lang")
private String lang;
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

@JsonProperty("content")
public String getContent() {
return content;
}

@JsonProperty("content")
public void setContent(String content) {
this.content = content;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("publishedAt")
public String getPublishedAt() {
return publishedAt;
}

@JsonProperty("publishedAt")
public void setPublishedAt(String publishedAt) {
this.publishedAt = publishedAt;
}

@JsonProperty("lang")
public String getLang() {
return lang;
}

@JsonProperty("lang")
public void setLang(String lang) {
this.lang = lang;
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