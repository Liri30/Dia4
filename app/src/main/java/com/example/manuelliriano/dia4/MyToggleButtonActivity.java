package com.example.manuelliriano.dia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MyToggleButtonActivity extends AppCompatActivity implements View.OnClickListener{

    private ToggleButton myToggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_toggle_button);
        myToggleButton=findViewById(R.id.my_toggle_button);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,
                myToggleButton.isChecked()? "Cheked":"Not Checked",
                Toast.LENGTH_SHORT).show();
    }
}
