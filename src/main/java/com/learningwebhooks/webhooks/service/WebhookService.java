package com.learningwebhooks.webhooks.service;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.learningwebhooks.webhooks.modal.Github;
import com.learningwebhooks.webhooks.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WebhookService {

    private final GsonUtil gsonUtil;

    WebhookService(GsonUtil gsonUtil) {
        this.gsonUtil = gsonUtil;
    }

    public Github handleGithubWebhook(String githubString) {
        try {
            log.info("Converting Github's webhook from String to Json Object: " + githubString);
            Gson gson = gsonUtil.createGsonBuilder();
            Github github = gson.fromJson(githubString, Github.class);
            log.info("Github webhook json object: " + github);
            return github;
        } catch (JsonIOException e) {
            //TODO update error handling
            log.error("Error in handleGithubWebhook: " + e.getMessage());
            return Github.builder().build();
        }
    }
}
