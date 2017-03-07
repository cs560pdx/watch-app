package com.example.android.androidwear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button button_activity;
    private Button button_sleeping;
    private Button button_water;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                button_activity = (Button) stub.findViewById(R.id.button_exercise);
                button_activity.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toNext = new Intent(MainActivity.this,ChooserActivity.class);
                        startActivity(toNext);
                    }
                });
                button_sleeping = (Button) stub.findViewById(R.id.button_sleeping);
                button_sleeping.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toNext = new Intent(MainActivity.this,ChooserSleeping.class);
                        startActivity(toNext);
                    }
                });
                button_water = (Button) stub.findViewById(R.id.button_water);
                button_water.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toNext = new Intent(MainActivity.this,ChooserWater.class);
                        startActivity(toNext);
                    }
                });
            }
        });


    }
}
