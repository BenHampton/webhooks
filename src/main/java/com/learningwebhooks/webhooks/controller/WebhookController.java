package com.learningwebhooks.webhooks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO Run Locally: 'ssh -R 80:localhost:{localPort} localhost.run'
// Test Webhook Site: https://webhook.site/#!/83115935-7cb5-4521-a91b-2fa8ea66297d/63b4b60e-a4b9-4129-ae52-0ec557c797e8/1
// Links: https://andrewlock.net/using-ssh-and-localhost-run-to-test-github-webhooks-locally/

@RestController
@RequestMapping("/api/webhooks")
@Slf4j
public class WebhookController {

    @PostMapping( value = "/github")
    public String gitWebhook(@RequestBody String payload) {
        log.info("Webhook payload: " + payload);
        return "We're Working Locally";
    }
}
