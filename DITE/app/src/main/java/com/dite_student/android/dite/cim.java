package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cim);
    }public void open_cim2017(View view) {
        Intent i = new Intent(this, cim2017.class);
        startActivity(i);

    }
}
