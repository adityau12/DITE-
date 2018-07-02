package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class cim2017 extends AppCompatActivity {
    public void open_cim2017(View view) {
        Intent i = new Intent(this, cim2017.class);
        startActivity(i);

    }

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_met);
        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("cim2017.pdf").load();
    }

}
