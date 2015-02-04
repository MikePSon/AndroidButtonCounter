package com.example.mikepatterson.testproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView text;
    int clicker = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        text = (TextView) findViewById(R.id.textViewtest);
        text.setText("Your count: " + 0);

        Button plusButton = (Button) findViewById(R.id.addButton);
        plusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clicker++;
                text.setText("Your count: " + clicker);
            };
        });

        Button minusButton = (Button) findViewById(R.id.subtButton);
        minusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clicker--;
                text.setText("Your count: " + clicker);
            };
        });

        Button clearBtn = (Button) findViewById(R.id.clrButton);
        clearBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clicker=0;
                text.setText("Your count: " + clicker);
            };
        });
    };


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
}
