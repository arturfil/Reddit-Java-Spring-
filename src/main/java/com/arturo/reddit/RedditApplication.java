package com.arturo.reddit;

import com.arturo.reddit.config.RedditProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
public class RedditApplication {

    private static final Logger log = LoggerFactory.getLogger(RedditApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
        };
    }

}