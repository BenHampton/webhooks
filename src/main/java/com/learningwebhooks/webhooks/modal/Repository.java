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
public class Repository {

    private Long id;

    private String name;

    @SerializedName(value = "full_name")
    private String fullName;

    private String url;
}
