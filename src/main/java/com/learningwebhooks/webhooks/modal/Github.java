package com.learningwebhooks.webhooks.modal;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    private Repository repository;

    private Pusher pusher;

    private Sender sender;

    private List<Commits> commits;

    @SerializedName(value = "head_commit")
    private Commits headCommit;
}
