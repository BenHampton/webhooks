package com.learningwebhooks.webhooks.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GitWebhook {

    private String ref;

    private String before;

    private String after;

    private Repository repository;
}
