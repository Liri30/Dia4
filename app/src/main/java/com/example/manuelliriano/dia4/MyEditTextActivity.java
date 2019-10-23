package com.example.manuelliriano.dia4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MyEditTextActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText myEditTex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_edit_text);
        myEditTex=findViewById(R.id.my_edit_text);

        findViewById(R.id.my_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, myEditTex.getText(), Toast.LENGTH_SHORT).show();
    }


}
