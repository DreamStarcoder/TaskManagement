package com.example.gssc_community.models;

import androidx.annotation.NonNull;


public class PostId {

    public String postId;

    public <T extends PostId> T withId(@NonNull final String id) {
        this.postId = id;
        return (T) this;
    }

}
