package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SeeAllBooksActivity extends AppCompatActivity {
    private static final String TAG = "SeeAllBooksActivity";
      RecyclerView listView;
      ArrayList <Book>books=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_books);
        Log.d(TAG, "onCreate: ");
        listView=findViewById(R.id.recylerId);
         AllBookAdapter allBookAdapter=new AllBookAdapter(getApplicationContext());
         listView.setAdapter(allBookAdapter);
         listView.setLayoutManager(new GridLayoutManager(this,2));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       Util util=new Util();
       books=util.getAllBoooks();
       allBookAdapter.setBooks(books);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                super.onBackPressed();
                break;
                default:
                    break;
        }
        return super.onOptionsItemSelected(item);
    }
}
