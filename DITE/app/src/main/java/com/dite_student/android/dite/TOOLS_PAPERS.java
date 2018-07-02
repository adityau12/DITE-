package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TOOLS_PAPERS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools__papers);
    }
    public void open_tools_1_sem(View view) {
        Intent i = new Intent(this, tools_1_sem.class);
        startActivity(i);

    }
    public void open_tools_2_sem(View view) {
        Intent i = new Intent(this, tools_2_sem.class);
        startActivity(i);

    }public void open_tools_3_sem(View view) {
        Intent i = new Intent(this, tools_3_sem.class);
        startActivity(i);

    }public void open_tools_4_sem(View view) {
        Intent i = new Intent(this, tools_4_sem.class);
        startActivity(i);

    }public void open_tools_5_sem(View view) {
        Intent i = new Intent(this, tools_5_sem.class);
        startActivity(i);

    }public void open_tools_6_sem(View view) {
        Intent i = new Intent(this, tools_6_sem.class);
        startActivity(i);

    }public void open_tools_7_sem(View view) {
        Intent i = new Intent(this, tools_7_sem.class);
        startActivity(i);

    }public void open_tools_8_sem(View view) {
        Intent i = new Intent(this, tools_8_sem.class);
        startActivity(i);

    }
}
