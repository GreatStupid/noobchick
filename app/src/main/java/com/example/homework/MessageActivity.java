package com.example.homework;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends AppCompatActivity {

    private List<People> peopleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        initPeople();
        PeopleAdapter adapter = new PeopleAdapter(MessageActivity.this,R.layout.list_item,peopleList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.hide();
        }
    }

    private void initPeople(){
     for (int i = 0;i < 4;i++){
         People apple = new People("Apple","redRedRedRedRedRed",R.drawable.apple_pic);
         peopleList.add(apple);
         People banana = new People("Banana","yellowYellowYellowYellow",R.drawable.banana_pic);
         peopleList.add(banana);
         People orange = new People("Orange","sourSourSourSour",R.drawable.orange_pic);
         peopleList.add(orange);
     }
    }
}