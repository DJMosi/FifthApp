package com.djmosi.fifthapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;
import com.twotoasters.jazzylistview.JazzyListView;
import com.twotoasters.jazzylistview.effects.SlideInEffect;


public class T2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2);


        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.man);

        com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton actionButton = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this)
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
                Intent a = new Intent(T2Activity.this, LoginActivity.class);
                startActivity(a);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(T2Activity.this, MainActivity.class);
                startActivity(a);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(T2Activity.this, T3Activity.class);
                startActivity(a);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(T2Activity.this, T4Activity.class);
                startActivity(a);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(T2Activity.this, T5Activity.class);
                startActivity(a);

            }
        });


        JazzyListView list = (JazzyListView) findViewById(R.id.list);
        list.setTransitionEffect(new SlideInEffect());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                new String[]{
                        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7",
                        "Item 8", "Item 9", "Item 10","Item 11", "Item 12", "Item 13", "Item 14",
                        "Item 15", "Item 16", "Item 17", "Item 18", "Item 19", "Item 20"
                });
        list.setAdapter(adapter);

    }

}
