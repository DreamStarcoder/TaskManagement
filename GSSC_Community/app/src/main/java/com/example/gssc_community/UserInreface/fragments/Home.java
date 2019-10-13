package com.example.gssc_community.UserInreface.fragments;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.gssc_community.adapters.PostsAdapter;
import com.example.gssc_community.models.Post;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class  Home extends Fragment{

    private List<Post> mPostsList;
    private FirebaseFirestore mFirestore;
    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;
    private RecyclerView mPostsRecyclerView;
    private View mView;
    private List<String> mFriendIdList=new ArrayList<>();
    private View statsheetView;
    private BottomSheetDialog mmBottomSheetDialog;
    private SwipeRefreshLayout refreshLayout;
    private PostsAdapter mAdapter_v19;
}