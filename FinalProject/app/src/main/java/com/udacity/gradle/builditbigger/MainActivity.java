package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.weeturretstudio.warbeleth.android.aar.JokeActivity;
import com.weeturretstudio.warbeleth.android.fun.JokeClass;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        //Call the AsyncEndpoint
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Bob"));


        //JokeClass test = new JokeClass();

        //Toast.makeText(this, test.TellJoke(), Toast.LENGTH_SHORT).show();

        //Launch library activity
        //Intent intent = new Intent(this, JokeActivity.class);
        //intent.putExtra(JokeActivity.ACTIVITY_JOKE_EXTRA, test.TellJoke());

        //this.startActivity(intent);
    }


}
