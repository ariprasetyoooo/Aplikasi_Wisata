package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= (Button) findViewById(R.id.login);

        login.setOnClickListener(v ->{
            Intent Inten1 = new Intent(getApplicationContext(),MenuUtama.class);
            startActivity(Inten1);
        });
    }
}