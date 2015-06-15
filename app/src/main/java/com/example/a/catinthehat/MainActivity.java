package com.example.a.catinthehat;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTheCat = (Button) findViewById(R.id.buttonTheCat);
        buttonTheCat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonTheCatText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        Button buttonThing1 = (Button) findViewById(R.id.buttonThing1);
        buttonThing1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonThing1Text), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonThing2 = (Button) findViewById(R.id.buttonThing2);
        buttonThing2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonThing2Text), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button buttonThingamajigger = (Button) findViewById(R.id.buttonThingamajigger);
        buttonThingamajigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonThingamajiggerText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonSally = (Button) findViewById(R.id.buttonSally);
        buttonSally.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonSallyText), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button buttonNick = (Button) findViewById(R.id.buttonNick);
        buttonNick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonNickText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button buttonDrSeuss = (Button) findViewById(R.id.buttonDrSeuss);
        buttonDrSeuss.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonDrSeussText), Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //no
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

}
