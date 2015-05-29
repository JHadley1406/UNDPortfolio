package com.hhi.training.undportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Portfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void capstone(View view)
    {
        showToast("Capstone Project Goes Here");
    }

    public void xyzReader(View view)
    {
        showToast("XYZ Reader Goes Here");
    }

    public void buildItBigger(View view)
    {
        showToast("Build It Bigger Goes Here");
    }

    public void library(View view)
    {
        showToast("Library Goes Here");
    }

    public void scores(View view)
    {
        showToast("Scores Goes Here");
    }

    public void spotifyStreamer(View view)
    {
        showToast("Spotify Streamer Goes Here");
    }

    private void showToast(String message)
    {
        Toast toast = Toast.makeText(getApplicationContext()
                , message
                , Toast.LENGTH_LONG);

        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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
}
