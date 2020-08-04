package com.example.customviewtest;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondView extends AppCompatActivity {

    CustomImage customImage;
    ConstraintLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);

        root = findViewById(R.id.cons);

        customImage = new CustomImage(this);

        try {
            //customImage.setImageResource(R.drawable.first_image);
            customImage.setText("Allah is one");


        } finally {

            root.addView(customImage);
            Toast.makeText(this, String.valueOf(customImage.getText()), Toast.LENGTH_SHORT).show();
        }
    }
}