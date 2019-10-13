package com.example.gssc_community.UserInreface.Friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.example.gssc_community.R;

public class FriendProfile extends AppCompatActivity {

    public static void startActivity(Context context, String userId) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_profile);
    }
}
