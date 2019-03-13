package com.conference.api.documents;

/**
 * Sponsers
 */
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
"One of platinum, gold, supporter, tech"
})
public class Sponsers {

@JsonProperty("One of platinum, gold, supporter, tech")
private List<Sponser> sponsers = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Sponsers(){
    /** for jackson */
}

public Sponsers(List<Sponser> sponsers){
    this.sponsers = sponsers;
}
@JsonProperty("One of platinum, gold, supporter, tech")
public List<Sponser> getSponser() {
return sponsers;
}

@JsonProperty("One of platinum, gold, supporter, tech")
public void setSponser(List<Sponser> sponsers) {
this.sponsers = sponsers;
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