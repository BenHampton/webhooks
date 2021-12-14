package com.learningwebhooks.webhooks.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.learningwebhooks.webhooks.modal.Github;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WebhookService {

    public Github handleGithubWebhook(String githubString) {
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            Gson gson = gsonBuilder.create();
            Github github = gson.fromJson(githubString, Github.class);
            return github;
        } catch (JsonIOException e) {
            log.error("error in handleGithubWebhook: " + e.getMessage());
            return Github.builder().build();
        }
    }
}
