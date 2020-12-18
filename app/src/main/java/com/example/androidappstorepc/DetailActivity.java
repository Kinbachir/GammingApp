package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button returnButton=findViewById(R.id.returnButton);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            name.setText(mBundle.getString("Title"));
            image.setImageResource(mBundle.getInt("Image"));
            description.setText(mBundle.getString("Description"));
        }
        returnButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        returnHome();
                        finish();
                    }
                }
        );
    }

    private void returnHome() {
        startActivity(new Intent(this, HomeActivity.class));
    }
}