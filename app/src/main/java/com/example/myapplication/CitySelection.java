package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class CitySelection extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void citySelection(View view) {
        Intent intent = new Intent(CitySelection.this, WeatherActivity.class);
        startActivity(intent);
    }
}
