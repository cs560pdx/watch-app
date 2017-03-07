package com.example.android.androidwear;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ChooserActivity extends AppCompatActivity {
    private Button addNewExercise;
    private Button history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff005fbf));
        addNewExercise = (Button) findViewById(R.id.button_add_new);
        addNewExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooserActivity.this, AddNewExercise.class);
                startActivity(intent);
            }
        });
        history = (Button) findViewById(R.id.button_today_activity);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooserActivity.this, exerciseHistory.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId){
            case android.R.id.home:
                Intent intent = new Intent(ChooserActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.action_home:
                Intent intent_home = new Intent(ChooserActivity.this, MainActivity.class);
                startActivity(intent_home);
                break;
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
}
