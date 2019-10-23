package com.example.manuelliriano.dia4;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MyCheckBoxActivity extends AppCompatActivity implements OnClickListener {

    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_check_box);
        checkBox=findViewById(R.id.my_check_box);
        findViewById(R.id.my_btn3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,
                checkBox.isChecked()? getChecked() : getString(),
                Toast.LENGTH_SHORT).show();
    }

    @NonNull
    private String getString() {
        return "Not Checked";
    }

    @NonNull
    private String getChecked() {
        return "Checked";
    }
}
