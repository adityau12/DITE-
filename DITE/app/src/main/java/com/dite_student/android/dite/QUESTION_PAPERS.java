package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QUESTION_PAPERS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question__papers);
    }
    public void open_mechatronics_papers(View view) {
        Intent i = new Intent(this, mechatronics_papers.class);
        startActivity(i);

    }
    public void open_tools_paper(View view) {
        Intent i = new Intent(this, TOOLS_PAPERS.class);
        startActivity(i);

    }
}
