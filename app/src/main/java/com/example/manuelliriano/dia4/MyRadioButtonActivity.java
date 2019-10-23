package com.example.manuelliriano.dia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MyRadioButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton myRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_button);
        myRadioButton=findViewById(R.id.my_radio_button);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this, myRadioButton.isChecked()?"Checked":"Not Checked", Toast.LENGTH_SHORT).show();
        myRadioButton.setChecked(false);
    }
}
