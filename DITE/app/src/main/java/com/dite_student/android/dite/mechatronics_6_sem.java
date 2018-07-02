package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mechatronics_6_sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechatronics_6_sem);
    }
    public void open_cim(View view) {
        Intent i = new Intent(this, cim.class);
        startActivity(i);

    }
}
