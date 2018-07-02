package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class syllabus_tool extends AppCompatActivity {
    public void open_tools_syllabus(View view) {
        Intent i = new Intent(this, syllabus_tool.class);
        startActivity(i);

    }

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_tool);
        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("tools.pdf").load();
    }

}
