package com.learningwebhooks.webhooks.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

@Component
public class GsonUtil {

    public Gson createGsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        return gsonBuilder.create();
    }
}
