package com.example.homework;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {

    private  int resourceId;

    public PeopleAdapter(Context context, int textViewResourceId, List<People> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        People people = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView peopleAvatar = (ImageView) view.findViewById(R.id.people_avatar);
        TextView peopleName = (TextView) view.findViewById(R.id.people_name);
        TextView peopleText = (TextView) view.findViewById(R.id.people_text);
        peopleAvatar.setImageResource(people.getImageId());
        peopleName.setText(people.getName());
        peopleText.setText(people.getText());
        return view;
    }
}
