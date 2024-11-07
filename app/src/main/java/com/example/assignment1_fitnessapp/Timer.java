//package com.example.assignment1_fitnessapp;
package com.example.assignment1_fitnessapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class Timer extends AppCompatActivity {
    ImageView imageView;
    String url = "https://i.pinimg.com/originals/39/6e/b8/396eb8e10ae03320e718152d6a743206.gif";
    TextView timer;
    TextView thx;
    CountDownTimer countDownTimer;
    Button button;
    Button backButton;
    int time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_timer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
         time = intent.getIntExtra("time",0); // it return the activity time needed
        time = time*60000;
        String url1 = intent.getStringExtra("url");

        imageView = findViewById(R.id.imageView2);
        Glide.with(this).load(url1).into(imageView);

        timer = findViewById(R.id.timer_activity_time_textview);
        thx = findViewById(R.id.timer_activity_done_textView);
        button = findViewById(R.id.reset_button);
        backButton = findViewById(R.id.timaer_activity_back_button);

        startTimer();
        button.setOnClickListener(view -> {resetTimer();});
        backButton.setOnClickListener(view -> {
            super.onBackPressed();
        });


    }

    private void startTimer(){

        countDownTimer = new CountDownTimer(time,1000) {
            @Override
            public void onTick(long l) {
                long hours= (l/1000)/3600;
                long minutes=((l/1000) % 3600) /60;
                long seconds = (l/1000) % 60;
                String timerFormat = String.format(Locale.getDefault(),"%02d:%02d:%02d",hours,minutes,seconds);
                timer.setText(timerFormat);

            }

            @Override
            public void onFinish() {
                timer.setText("00:00:00");
                thx.setVisibility(View.VISIBLE);
            }
        }.start();

    }
    private void resetTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel(); // Cancel the current timer if it's running
        }
        if (thx.getVisibility()== View.VISIBLE) {
            thx.setVisibility(View.INVISIBLE);
        }
        startTimer(); // Restart the timer with the original time
    }

}