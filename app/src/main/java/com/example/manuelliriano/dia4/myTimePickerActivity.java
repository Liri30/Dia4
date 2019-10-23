package com.example.manuelliriano.dia4;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class myTimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private TimePicker myTimePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_time_picker);
        myTimePicker = findViewById(R.id.my_time_picker);
        findViewById(R.id.my_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            sb.append(myTimePicker.getHour())
                    .append(":")
                    .append(myTimePicker.getMinute());
        }
        else{
            sb.append(myTimePicker.getCurrentHour())
                    .append(":")
                    .append(myTimePicker.getCurrentMinute());
        }
        Toast.makeText(this,
                sb.toString(),
                Toast.LENGTH_SHORT).show();
    }
}
