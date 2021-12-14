package com.learningwebhooks.webhooks.modal;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sender {

    private Long id;

    private String login;

    private String url;

    @SerializedName(value ="avatar_url")
    private String avatarUrl;
}
