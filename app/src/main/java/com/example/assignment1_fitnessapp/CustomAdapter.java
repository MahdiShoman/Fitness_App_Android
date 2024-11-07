package com.example.assignment1_fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter  extends ArrayAdapter<Activity> {

    public CustomAdapter(Context context, List<Activity> itemList) {
        super(context, 0, itemList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the layout if convertView is null
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview_layout, parent, false);
        }

        // Get the data item for this position
        Activity item = getItem(position);

        // Lookup view for data population
        ImageView itemImage = convertView.findViewById(R.id.Custom_listview_avtivity_imageView);
        TextView itemText = convertView.findViewById(R.id.Custom_listview_avtivity_textView);

        // Populate the data into the template view using the data object
        if (item != null) {
            itemImage.setImageResource(item.getImage());
            itemText.setText(item.getName());
        }

        // Return the completed view to render on screen
        return convertView;
    }
}
