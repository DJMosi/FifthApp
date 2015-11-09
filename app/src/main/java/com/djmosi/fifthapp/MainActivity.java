package com.djmosi.fifthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


import static android.app.PendingIntent.getActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // in Activity Context
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.man);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.set);
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.mail);
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.like);
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();

        ImageView itemIcon4 = new ImageView(this);
        itemIcon4.setImageResource(R.drawable.photo);
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();

        ImageView itemIcon5 = new ImageView(this);
        itemIcon5.setImageResource(R.drawable.like);
        SubActionButton button5 = itemBuilder.setContentView(itemIcon5).build();


        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .addSubActionView(button5)

                        // ...
                .attachTo(actionButton)
                .build();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(a);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, T2Activity.class);
                startActivity(a);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, T3Activity.class);
                startActivity(a);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, T4Activity.class);
                startActivity(a);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, T5Activity.class);
                startActivity(a);

            }
        });



        }//end of onCreate

    }
