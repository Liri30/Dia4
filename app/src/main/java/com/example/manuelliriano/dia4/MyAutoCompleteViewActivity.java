package com.example.manuelliriano.dia4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MyAutoCompleteViewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_auto_complete_view);

        String[] animals = {"Dog", "Cat", "Mouse"};
        AutoCompleteTextView myAutocompleteTextView = findViewById(R.id.my_auto_complete_text_view);
        myAutocompleteTextView.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                animals));
    myAutocompleteTextView.setThreshold(1);

    //Get data

        Intent intent = getIntent();


        String val1 = intent.getStringExtra("val1");
        Toast.makeText(this,val1, Toast.LENGTH_SHORT).show();

        Bundle bundle = intent.getBundleExtra("persona");
        myAutocompleteTextView.setHint(bundle.getString("name"));
    }

    public void passData(View view){
        Intent intent = new Intent(this, AutoCompleteTextView.class);
        intent.putExtra("val1", "Valor 1");
        intent.putExtra("val2", false);

        Bundle b =  new Bundle();
        b.putString("name", "pepito");
        b.putInt("year", 26);
        intent.putExtra("persona",b);

        startActivity(intent);
    }
}
