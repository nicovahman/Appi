package com.example.nicolasvahman.appi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Coaches extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.item1:
                GoToPractice();
                return true;
            case R.id.item2:
                GoToAbout();
                return true;
            case R.id.item3:
                GoToCoaches();
                return true;
            case R.id.item4:
                GoToStart();
            case R.id.item5:
                GoToContact();

            default:
                return super.onOptionsItemSelected(item);
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaches);

        Button knapcoach = (Button) findViewById(R.id.coachKnap);
        final CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
        final TextView text1 = (TextView)  findViewById(R.id.textView17);
        final TextView text2 = (TextView)  findViewById(R.id.textView20);


       knapcoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Du har trykket på " + text1.getText().toString(), Toast.LENGTH_LONG).show();

                }

                if(check2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Du har trykket på " + text2.getText().toString(), Toast.LENGTH_LONG).show();
                }


            }
        });



    }
    public  void GoToPractice(){
        Intent intent1;
        intent1 = new Intent(this, Practice.class);
        startActivity(intent1);
    }

    public void GoToAbout() {
        Intent intent;
        intent=new Intent(this, OmKlubben.class);
        startActivity(intent);

    }

    public void GoToStart(){
        Intent intent3;
        intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
    public  void GoToContact(){
        Intent intent4;
        intent4 = new Intent(this, Kontakt.class);
        startActivity(intent4);
    }

    public void GoToCoaches(){
        Intent intent5;
        intent5 = new Intent(this, Coaches.class);
        startActivity(intent5);
    }


}