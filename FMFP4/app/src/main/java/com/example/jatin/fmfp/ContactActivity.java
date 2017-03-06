package com.example.jatin.fmfp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView tv=(TextView)findViewById(R.id.contactus);
        tv.setPaintFlags(tv.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        //TextView tv2=(TextView)findViewById(R.id.linkwebsite);
       // tv2.setMovementMethod(LinkMovementMethod.getInstance());

        ImageButton fb=(ImageButton)findViewById(R.id.fblink);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/FMFP-2016-1135144126510484/?ref=aymt_homepage_panel"));
                startActivity(i);
            }
        });

    }
}
