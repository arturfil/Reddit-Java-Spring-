package com.arturo.reddit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("reddit")
public class RedditProperties {

    private String welcomeMsg = "This is my Reddit App!";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}