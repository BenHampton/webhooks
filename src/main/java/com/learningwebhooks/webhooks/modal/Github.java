package com.learningwebhooks.webhooks.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Github {

    private String action;

    private String ref;

    private String before;

    private String after;

    private String compare;

//    private Repository repository;
//
//    private Pusher pusher;
//
//    private Sender sender;
//
//    private Commits commits;
//
    @JsonProperty(value = "head_commit")
    private Commits headCommit;
}
