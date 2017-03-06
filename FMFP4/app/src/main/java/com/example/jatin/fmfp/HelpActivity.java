package com.example.jatin.fmfp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelpActivity extends Activity {

    Button submitButton;
    EditText name,email,query;
    String ns,es,qs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        submitButton=(Button)findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name= (EditText) findViewById(R.id.e1);
                ns=name.getText().toString();
                email= (EditText) findViewById(R.id.e2);
                es=email.getText().toString();
                query= (EditText) findViewById(R.id.e3);
                qs=query.getText().toString();
                //Toast.makeText(getBaseContext(), "HELLO "+qs , Toast.LENGTH_SHORT).show();
                if(ns.equals("") || es.equals("") || qs.equals(""))
                    Toast.makeText(getBaseContext(), "All fields are mandatory!", Toast.LENGTH_SHORT).show();
                else {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("plain/text");
                    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"fmfp2016@gmail.com"});
                    i.putExtra(Intent.EXTRA_SUBJECT, "FMFP QUERY FROM USER : " + ns);
                    i.putExtra(Intent.EXTRA_TEXT, qs);
                    startActivity(Intent.createChooser(i, "Send mail via"));
                }
            }
        });

    }
}
