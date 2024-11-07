package com.example.assignment1_fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button main_Activity_button;
    ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        main_Activity_button =findViewById(R.id.Main_Activity_button);
        imageView = findViewById(R.id.Main_Activity_imageView2);

        imageView.setImageResource(R.drawable.img);

        main_Activity_button.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this,ExerciseBrowser.class);
            startActivity(intent);


        });


    }
}