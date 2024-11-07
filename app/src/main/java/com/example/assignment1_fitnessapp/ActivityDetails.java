package com.example.assignment1_fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityDetails extends AppCompatActivity {

    ImageView imageView;
    TextView nameTextView;
    TextView timeTextView;
    TextView detailsTextView;
    Button button;
    Button backButton;
    ActivitiesMockupData activitiesMockupData ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView= findViewById(R.id.activity_details_imageView);
        nameTextView  = findViewById(R.id.activity_details_textView_name);
        timeTextView = findViewById(R.id.activity_details_textView_time);
        detailsTextView = findViewById(R.id.activity_details_textView_avtivityDetails);
        button= findViewById(R.id.activity_details_button);
        backButton = findViewById(R.id.timaer_activity_back_button);
        activitiesMockupData = new ActivitiesMockupData();

        Intent intent = getIntent();
        int activityNumber = intent.getIntExtra("activityDetails",0);
        Activity selectedActivity = activitiesMockupData.activities.get(activityNumber);
        imageView.setImageResource(selectedActivity.getImage());
        nameTextView.setText(selectedActivity.getName()+"Activity");
        timeTextView.setText("Time: "+selectedActivity.getTime());
        detailsTextView.setText("Description: \n \n "+selectedActivity.getDescription());

        button.setOnClickListener(view -> {
            Intent intent1 = new Intent(ActivityDetails.this, Timer.class);
            intent1.putExtra("time",selectedActivity.getTime());
            intent1.putExtra("url",selectedActivity.getGifImage());
            startActivity(intent1);

        });

        backButton.setOnClickListener(view -> {
            super.onBackPressed();
        });


    }
}