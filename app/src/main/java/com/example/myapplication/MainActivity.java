package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //здесь поидее будет изменение строк через getString()/ setString() когда научимся данные из инета тянуть


    }



    public void onClick(View view) {
        //наверное здесь потом будет обработка клика по кнопке
    }
}