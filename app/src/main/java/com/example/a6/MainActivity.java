package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton button_account, button_filter, button_favorite, button_share, button_chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button_account = findViewById(R.id.button_account);
        button_filter = findViewById(R.id.button_filter);
        button_favorite = findViewById(R.id.button_favorite);
        button_share = findViewById(R.id.button_share);
        button_chat = findViewById(R.id.button_chat);

        button_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Account_Page.class);
                startActivity(intent);
            }
        });

        button_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Filter_Page.class);
                startActivity(intent);
            }
        });

        button_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Chat_Page.class);
                startActivity(intent);
            }
        });


    }
}