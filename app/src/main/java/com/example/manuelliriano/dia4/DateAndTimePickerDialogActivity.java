package com.example.manuelliriano.dia4;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTimePickerDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView lblDate, lblTime, lblDateTime;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;

    private Calendar calendar;
    private SimpleDateFormat dateFormat, timeFormat, dateTimeFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time_picker_dialog);
        calendar=Calendar.getInstance();
        dateFormat =  new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        timeFormat = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault());

        datePickerDialog = new DatePickerDialog(this,
                datePickerListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE));

        timePickerDialog = new TimePickerDialog(this,
                timePickerListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE), true);
        lblTime=findViewById(R.id.lbl_time);
        lblDate=findViewById(R.id.lbl_date);
        lblDateTime=findViewById(R.id.lbl_date_time);

        findViewById(R.id.btn_set_date).setOnClickListener(this);
        findViewById(R.id.btn_set_time).setOnClickListener(this);

        refreshDisplay();
    }

    private DatePickerDialog.OnDateSetListener datePickerListener =
            new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month);
            calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            refreshDisplay();

        }
    };

    private void refreshDisplay(){
        lblDateTime.setText(dateTimeFormat.format(calendar.getTime()));
        lblDate.setText(dateFormat.format(calendar.getTime()));
        lblTime.setText(timeFormat.format(calendar.getTime()));
    }

    private TimePickerDialog.OnTimeSetListener timePickerListener
            = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            calendar.set(Calendar.MINUTE, minute);
            refreshDisplay();

        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_set_date:
                datePickerDialog.show();
                break;

            case R.id.btn_set_time:
                timePickerDialog.show();
                break;
        }

    }
}
