package com.example.manuelliriano.dia4;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyButtonActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_button);
        findViewById(R.id.my_btn2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(this).setTitle("Titulo")
                .setPositiveButton("YES", this)
                .setNegativeButton("NO", this)
                .setNeutralButton("Ok", this)
                .create().show();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String msg = "Res. %s: val: %d";
        switch (which){
            case AlertDialog.BUTTON_NEGATIVE:
                msg = String.format(msg, "Negative", AlertDialog.BUTTON_NEGATIVE);
                break;

            case AlertDialog.BUTTON_NEUTRAL:
                msg=String.format(msg,"Neutral", AlertDialog.BUTTON_NEUTRAL);
                break;

            case AlertDialog.BUTTON_POSITIVE:
                msg=String.format(msg,"Positive", AlertDialog.BUTTON_POSITIVE);
                break;
        }
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}
