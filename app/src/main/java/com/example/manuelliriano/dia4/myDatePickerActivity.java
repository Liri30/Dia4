package com.example.manuelliriano.dia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class myDatePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private DatePicker myDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_date_picker);
        myDatePicker=findViewById(R.id.my_date_picker);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder();
        sb.append(myDatePicker.getDayOfMonth())
                .append("/")
                .append(myDatePicker.getMonth())
                .append("/")
                .append(myDatePicker.getYear());
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}
