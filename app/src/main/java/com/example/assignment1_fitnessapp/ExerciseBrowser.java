package com.example.assignment1_fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExerciseBrowser extends AppCompatActivity {

    ListView listView;
    ActivitiesMockupData activitiesMockupData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise_browser);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.Exercise_Browser_activity_ListView);
        activitiesMockupData = new ActivitiesMockupData();


       /* ArrayAdapter<Activity> listViewAdapter = new ArrayAdapter<Activity>(this, R.layout.custom_listview_layout, activitiesMockupData.activities);
        listView.setAdapter(listViewAdapter);
*/
        CustomAdapter customAdapter = new CustomAdapter(this,activitiesMockupData.activities);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ExerciseBrowser.this, ActivityDetails.class);
                intent.putExtra("activityDetails",i);
                startActivity(intent);
            }
        });
    }
}