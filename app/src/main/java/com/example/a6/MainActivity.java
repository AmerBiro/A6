package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button_account, button_filter, button_chat, button_favorite, button_share;
    private ViewPager2 viewPager2;
    private List<MyEvent> myEventList;
    private EventAdapter eventAdapter;

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
        viewPager2 = findViewById(R.id.view_pager2);



        button_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"it is work ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Account_Page.class);
                startActivity(intent);
            }
        });

        button_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"it is work ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Filter_Page.class);
                startActivity(intent);
            }
        });

        button_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"it is work ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Chat_Page.class);
                startActivity(intent);
            }
        });




        myEventList = new ArrayList<>();
        myEventList.add(new MyEvent(R.drawable.tivoli_event,"Tivoli Event"));
        myEventList.add(new MyEvent(R.drawable.is_event,"Ice Event"));
        myEventList.add(new MyEvent(R.drawable.ic_baseline_share_24,"Third Event"));
        myEventList.add(new MyEvent(R.drawable.ic_baseline_filter_alt_36,"Fourth  Event"));


        eventAdapter = new EventAdapter(this,myEventList);
        viewPager2.setAdapter(eventAdapter);









    }


}