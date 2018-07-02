package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mechatronics_papers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechatronics_papers);
    }
    public void open_met_1_sem(View view) {
        Intent i = new Intent(this, mechatronics_1_sem.class);
        startActivity(i);

    }
    public void open_met_2_sem(View view) {
        Intent i = new Intent(this, mechatronics_2_sem.class);
        startActivity(i);

    }public void open_met_3_sem(View view) {
        Intent i = new Intent(this, mechatronics_3_sem.class);
        startActivity(i);

    }public void open_met_4_sem(View view) {
        Intent i = new Intent(this, mechatronics_4_sem.class);
        startActivity(i);

    }public void open_met_5_sem(View view) {
        Intent i = new Intent(this, mechatronics_5_sem.class);
        startActivity(i);

    }public void open_met_6_sem(View view) {
        Intent i = new Intent(this, mechatronics_6_sem.class);
        startActivity(i);

    }public void open_met_7_sem(View view) {
        Intent i = new Intent(this, mechatronics_7_sem.class);
        startActivity(i);

    }public void open_met_8_sem(View view) {
        Intent i = new Intent(this, mechatronics_8_sem.class);
        startActivity(i);

    }
}
