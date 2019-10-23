package com.example.manuelliriano.dia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MyRadioButtActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup myRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_butt);
        myRadioGroup = findViewById(R.id.my_radio_button);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        RadioButton selected = findViewById(myRadioGroup.getCheckedRadioButtonId());
        if (selected!=null){
            Toast.makeText(this,
                    selected.getText(),
                    Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,
                    "Please select an option",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
