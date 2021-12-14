package com.learningwebhooks.webhooks.controller;

import com.learningwebhooks.webhooks.modal.Github;
import com.learningwebhooks.webhooks.service.WebhookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO Run Locally: 'ssh -R 80:localhost:{localPort} localhost.run'
// Test Webhook Site: https://webhook.site/#!/83115935-7cb5-4521-a91b-2fa8ea66297d/63b4b60e-a4b9-4129-ae52-0ec557c797e8/1
// Links: https://andrewlock.net/using-ssh-and-localhost-run-to-test-github-webhooks-locally/
// https://ced43e31fdbbca.localhost.run/api/webhooks/github
@RestController
@RequestMapping("/api/webhooks")
@Slf4j
public class WebhookController {

    private final WebhookService webhookService;

    public WebhookController(WebhookService webhookService) {
        this.webhookService = webhookService;
    }

    @PostMapping( value = "/github")
    public ResponseEntity<Github> gitWebhook(@RequestBody String payload) {
        log.info("Webhook payload: " + payload);
        return ResponseEntity.ok(webhookService.handleGithubWebhook(payload));
    }
}
