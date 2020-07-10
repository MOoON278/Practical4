package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckerButtonClicked(View view) {

        displayToast(getString(R.string.toppings));

        if(((CheckBox) findViewById(R.id.chocolate_syrup)).isChecked()){
            displayToast(getString(R.string.chocolate_syrup));
        }

        if(((CheckBox) findViewById(R.id.sprinkles)).isChecked()){
            displayToast(getString(R.string.sprinkles));
        }

        if(((CheckBox) findViewById(R.id.crushed_nuts)).isChecked()){
            displayToast(getString(R.string.crushed_nuts));
        }
        if(((CheckBox) findViewById(R.id.cherries)).isChecked()){
            displayToast(getString(R.string.cherries));
        }

        if(((CheckBox) findViewById(R.id.orio_cookie)).isChecked()){
            displayToast(getString(R.string.orio_cookie_crumbles));
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

}