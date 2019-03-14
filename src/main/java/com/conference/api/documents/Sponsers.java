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
"latinum", 
"gold", 
"supporter", 
"tech"
})
public class Sponsers {

@JsonProperty("platinum")
private List<Sponser> platinum = null;
@JsonProperty("gold")
private List<Sponser> gold = null;
@JsonProperty("supporter")
private List<Sponser> supporter = null;
@JsonProperty("tech")
private List<Sponser> tech = null;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Sponsers(){
    /** for jackson */
}

public Sponsers(List<Sponser> platinum,List<Sponser> gold,List<Sponser> supporter,List<Sponser> tech){
    this.platinum = platinum;
    this.gold = gold;
    this.supporter = supporter;
    this.tech = tech;
}


@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

    /**
     * @return the platinum
     */
    @JsonProperty("platinum")
    public List<Sponser> getPlatinum() {
        return platinum;
    }

    /**
     * @param platinum the platinum to set
     */
    @JsonProperty("platinum")
    public void setPlatinum(List<Sponser> platinum) {
        this.platinum = platinum;
    }

    /**
     * @return the gold
     */
    @JsonProperty("gold")
    public List<Sponser> getGold() {
        return gold;
    }

    /**
     * @param gold the gold to set
     */
    @JsonProperty("gold")
    public void setGold(List<Sponser> gold) {
        this.gold = gold;
    }

    /**
     * @return the supporter
     */
    @JsonProperty("supporter")
    public List<Sponser> getSupporter() {
        return supporter;
    }

    /**
     * @param supporter the supporter to set
     */
    @JsonProperty("supporter")
    public void setSupporter(List<Sponser> supporter) {
        this.supporter = supporter;
    }

    /**
     * @return the tech
     */
    @JsonProperty("tech")
    public List<Sponser> getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    @JsonProperty("tech")
    public void setTech(List<Sponser> tech) {
        this.tech = tech;
    }

    /**
     * @param additionalProperties the additionalProperties to set
     */
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}