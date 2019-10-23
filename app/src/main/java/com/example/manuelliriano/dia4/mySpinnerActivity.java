package com.example.manuelliriano.dia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class mySpinnerActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner mySpinner;
    private String[] data = {"Vaca","Gato","Perro","El Vecino"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);
        mySpinner = findViewById(R.id.my_Spinner);

        /**Que es un adapter ?*/
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, data);
        mySpinner.setAdapter(adapter);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mySpinnerActivity.this,
                mySpinner.getSelectedItem().toString(),
                Toast.LENGTH_SHORT).show();
    }
}
