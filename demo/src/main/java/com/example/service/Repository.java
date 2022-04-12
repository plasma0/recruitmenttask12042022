package com.example.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

    @JsonProperty("full_name")
	private String fullName;
	private String description;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("stargazers_count")
    private Integer stargazers;
    @JsonProperty("created_at")
    private String createdAt;

	public Repository(String fullName, String description, String cloneUrl, Integer stargazers, String createdAt) {
		this.fullName = fullName;
        this.description = description;
        this.cloneUrl = cloneUrl;
        this.stargazers = stargazers;
        this.createdAt = createdAt;
	}
    
    public Repository() {}

	public String getFullName() {
        return fullName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getCloneUrl() {
        return cloneUrl;
    }
    
    public Integer getStargazers() {
        return stargazers;
    }
    
    public String getCreatedAt() {
        return cloneUrl;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }
    
    public void setStargazers(Integer stargazers) {
        this.stargazers = stargazers;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}