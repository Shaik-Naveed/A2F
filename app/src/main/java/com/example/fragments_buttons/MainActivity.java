package com.example.fragments_buttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);


        //when button 1 is clicked it will display transaction 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FirstFragment fragment1 = new FirstFragment();
                transaction.replace(R.id.frame1,fragment1);
                transaction.commit();

            }
        });

        //when button 2 is clicked it will display transaction 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                SecondFragment fragment2= new SecondFragment();
                transaction.replace(R.id.frame1,fragment2);
                transaction.commit();

            }
        });

    }
}