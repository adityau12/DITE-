package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
    }

    public void open_tools_syllabus(View view) {
        Intent i = new Intent(this, syllabus_tool.class);
        startActivity(i);
    }
    public void open_met_syllabus(View view) {
        Intent i = new Intent(this, syllabus_met.class);
        startActivity(i);
    }
}