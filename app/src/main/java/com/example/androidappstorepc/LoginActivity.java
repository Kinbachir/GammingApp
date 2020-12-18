package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton=findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        verfieDonner();
                    }
                }
        );
    }
    EditText email;
    EditText password;
    TextView message;
    private void verfieDonner() {
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        message=findViewById(R.id.message);
        if(isValidEmail(email.getText().toString())) {
            if (password.getText().toString().length()<8 &&!isValidPassword(password.getText().toString()))
            {
                message.setText("Le mot de passe doit contenir au moins 8 caractères, au moins 1 alphabet et 1 chiffre ");
            }
            else
            {
                SharedPreferences shared=getSharedPreferences(Constant.NAMESHARED, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=shared.edit();
                editor.putBoolean(Constant.ISCONNECTED,true);
                editor.apply();
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                message.setText("");
            }
        }
        else
        {
            message.setText("Vérifiez votre e-mail");
        }
    }

    public static boolean isValidEmail(String target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
    public static boolean isValidPassword(String s) {
        Pattern PASSWORD_PATTERN= Pattern.compile("[a-zA-Z0-9]{8,24}");
        return !TextUtils.isEmpty(s) && PASSWORD_PATTERN.matcher(s).matches();
    }
}