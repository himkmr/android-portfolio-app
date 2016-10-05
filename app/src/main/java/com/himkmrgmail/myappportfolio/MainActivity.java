package com.himkmrgmail.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onButtonClick(View view) {
        Toast toast;
        switch (view.getId()) {
            case (R.id.button_bigger):
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_cap):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Capstone app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_hawk):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Stock Hawk app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_material):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Material app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_movie):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Movies app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_ub):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Ubiquitous app", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
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
