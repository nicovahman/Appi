package com.example.nicolasvahman.appi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Kontakt extends AppCompatActivity {


    private EditText editTextto;
    private EditText editTextEmne;
    private EditText editTextMessage;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);

        editTextto = findViewById(R.id.til);
        editTextEmne = findViewById(R.id.editText5);
        editTextMessage = findViewById(R.id.editText6);


        Button send = (findViewById(R.id.button_send));
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMail();
            }
        });


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
                Toast.makeText(this, "Item 3 was clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                GoToStart();
            case R.id.item5:
                GoToContact();

            default:
                return super.onOptionsItemSelected(item);
        }

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

    public void sendMail(){
        String modtagere = editTextto.getText().toString();
        String [] modtagerliste = modtagere.split(",");


        String emne = editTextEmne.getText().toString();
        String besked = editTextMessage.getText().toString();

        Intent intent4 = new Intent(Intent.ACTION_SEND);
        intent4.putExtra(Intent.EXTRA_EMAIL, modtagerliste);
        intent4.putExtra(Intent.EXTRA_SUBJECT,emne);
        intent4.putExtra(Intent.EXTRA_TEXT, besked);

        intent4.setType("message/rfc822");
        startActivity(Intent.createChooser(intent4, "Vælg en email du vil benytte"));

    }



}
