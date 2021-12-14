package com.learningwebhooks.webhooks.modal;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commits {

    private String id;

    private String message;

    private String url;

    @SerializedName(value = "timestamp")
    private String timestampString;

    @SerializedName(value = "tree_id")
    private String treeId;

    private Boolean distinct;

    private Pusher author;

    private Pusher committer;

    @SerializedName(value = "added")
    private List<String> addedList = new ArrayList<>();

    @SerializedName(value = "removed")
    private List<String> removedList = new ArrayList<>();

    @SerializedName(value = "modified")
    private List<String> modifiedList = new ArrayList<>();
}
