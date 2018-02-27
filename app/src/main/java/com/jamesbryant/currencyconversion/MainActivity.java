package com.jamesbryant.currencyconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertMonies(View view) {

        //Receives User Text
        EditText editText = (EditText) findViewById(R.id.AmountEditText);

        String amountInDollars = editText.getText().toString();

        Double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        Double amountInPoundsDouble = amountInDollarsDouble * 0.72;

        String amountInPoundsString = String.format( "%.2f", amountInPoundsDouble);

        Toast.makeText(this, "$" + amountInDollars + " is equal to £" + amountInPoundsString, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "$" + amountInDollars + " is equal to £" + amountInPoundsString, Toast.LENGTH_LONG).show();
    } 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
