package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_DeviceDefault);
        setContentView(R.layout.activity_detail);
        ImageView image = findViewById(R.id.image);
        TextView description = findViewById(R.id.description);
        TextView name=findViewById(R.id.name);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            name.setText(mBundle.getString("Title"));
            image.setImageResource(mBundle.getInt("Image"));
            description.setText(mBundle.getString("Description"));
        }
    }
}