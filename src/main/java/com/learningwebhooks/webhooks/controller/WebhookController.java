package com.learningwebhooks.webhooks.controller;

import com.learningwebhooks.webhooks.modal.GitWebhook;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhooks")
@Slf4j
public class WebhookController {

    @PostMapping("/git")
    public GitWebhook gitWebhook(GitWebhook gitWebhook) {
        log.info("Logging webhook: " + gitWebhook);
        return gitWebhook;
    }
}
