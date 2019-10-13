package com.example.gssc_community.UserInreface.forum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.example.gssc_community.R;

public class AnswersActivity extends AppCompatActivity {

    public static void startActivity(Context context, String question_doc_id) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);
    }
}
