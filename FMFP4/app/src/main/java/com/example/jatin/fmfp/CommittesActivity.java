package com.example.jatin.fmfp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jatin.fmfp.Committees.ConfererenceChairActivity;
import com.example.jatin.fmfp.Committees.InternationalAdvisoryActivity;
import com.example.jatin.fmfp.Committees.LocalAdvisoryActivity;
import com.example.jatin.fmfp.Committees.LocalOrganisingActivity;
import com.example.jatin.fmfp.Committees.NationalAdvisoryActivty;
import com.example.jatin.fmfp.Committees.TechnicalProgramActivity;

public class CommittesActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committes);
        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), ConfererenceChairActivity.class);
                startActivity(i);
            }
        });

        btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), InternationalAdvisoryActivity.class);
                startActivity(i);
            }
        });

        btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), NationalAdvisoryActivty.class);
                startActivity(i);
            }
        });

        btn4= (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), LocalAdvisoryActivity.class);
                startActivity(i);
            }
        });

        btn5= (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), TechnicalProgramActivity.class);
                startActivity(i);
            }
        });

        btn6= (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(), LocalOrganisingActivity.class);
                startActivity(i);
            }
        });
    }
}
