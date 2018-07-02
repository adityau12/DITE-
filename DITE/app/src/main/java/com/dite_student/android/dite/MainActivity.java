package com.dite_student.android.dite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void open_qp(View view) {
            Intent i = new Intent(this, QUESTION_PAPERS.class);
            startActivity(i);

        }

        public void open_syllabus(View view) {
            Intent i = new Intent(this, syllabus.class);
            startActivity(i);
        }
        public void open_contact(View view) {
            Intent i = new Intent(this, contact.class);
            startActivity(i);
        }
    }
