package com.example.nicolasvahman.appi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        ImageView imageView1 = (ImageView) findViewById(R.id.imageView3);
        imageView1.setImageResource(R.drawable.greve);


        //test


    }
}
