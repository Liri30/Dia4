package com.example.manuelliriano.dia4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMyTextViewActivity(View view){
        goToActivity(new Intent(this, myTextViewActivity.class));
    }

    public void goToMyImageViewActivity(View view){
        goToActivity(new Intent(this, MyImageViewActivity.class));
    }

    public void goToEditTextViewActivity(View view){
        goToActivity(new Intent(this, MyEditTextActivity.class));
    }

    public void goToAutoCompleteTextViewActivity(View view){
        goToActivity(new Intent(this, MyAutoCompleteViewActivity.class));
    }

    public void goToButtonViewActivity(View view){
        goToActivity(new Intent(this, MyButtonActivity.class));
    }

    public void goToImageButtonViewActivity(View view){
        goToActivity(new Intent(this, MyImageButtonActivity.class));
    }

    public void goToCheckBoxActivity(View view){
        goToActivity(new Intent(this, MyCheckBoxActivity.class));
    }

    public void goToToggleButtonActivity(View view){
        goToActivity(new Intent(this, MyToggleButtonActivity.class));
    }

    public void goToRadioButtonActivity(View view){
        goToActivity(new Intent(this, MyRadioButtonActivity.class));
    }
    public void goToMyRadioGroupButtonActivity(View view){
        goToActivity(new Intent(this, MyRadioButtActivity.class));
    }
    public void goToMyProgressBarActivity(View view){
        goToActivity(new Intent(this, MmyProgressBarctivity.class));
    }
    public void goToMySpinnerActivity(View view){
        goToActivity(new Intent(this, mySpinnerActivity.class));
    }
    public void goToMyTimePickerActivity(View view){
        goToActivity(new Intent(this, myTimePickerActivity.class));
    }
    public void goToMyDatePickerActivity(View view){
        goToActivity(new Intent(this, myDatePickerActivity.class));
    }

    public void goToMyDateAndTimePickerDialogActivity(View view){
        goToActivity(new Intent(this, DateAndTimePickerDialogActivity.class));
    }

    private void goToActivity(Intent intent){
        startActivity(intent);
    }
}
