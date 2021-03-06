package com.example.gssc_community.models;


import androidx.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

public class QuestionID {

    @Exclude
    public String question_doc_id;

    public <T extends QuestionID> T withId(@NonNull final String id) {
        this.question_doc_id = id;
        return (T) this;
    }


}
