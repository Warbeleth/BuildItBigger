package com.weeturretstudio.warbeleth.android.aar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String ACTIVITY_JOKE_EXTRA = "EXTRA_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent invokingIntent = getIntent();

        if(invokingIntent != null) {
            if(invokingIntent.hasExtra(ACTIVITY_JOKE_EXTRA)) {
                String joke = invokingIntent.getStringExtra(ACTIVITY_JOKE_EXTRA);

                ((TextView)findViewById(R.id.tv_joke_to_display)).setText(joke);
            }
        }
    }
}
