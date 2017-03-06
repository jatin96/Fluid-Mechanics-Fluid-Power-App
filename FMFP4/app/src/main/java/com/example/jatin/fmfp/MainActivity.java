package com.example.jatin.fmfp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {

    at.markushi.ui.CircleButton maps,update,about,contactus,help,
            accomodation,sponsors,committee,transport,proceedings
            ,schedule,announcement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        maps= (CircleButton) findViewById(R.id.map);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),MapsActivity.class);
                startActivity(i);
            }
        });

        about=(at.markushi.ui.CircleButton)findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),AboutActivity.class);
                startActivity(i);
            }
        });

        committee= (at.markushi.ui.CircleButton) findViewById(R.id.committee);
        committee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CommittesActivity.class);
                startActivity(i);
            }
        });

        accomodation= (at.markushi.ui.CircleButton) findViewById(R.id.accomodation);
        accomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),AccomodationActivity.class);
                startActivity(i);
            }
        });

        update=(at.markushi.ui.CircleButton)findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),UpdateActivity.class);
                startActivity(i);
            }
        });

        schedule= (at.markushi.ui.CircleButton) findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),ScheduleActivity.class);
                startActivity(i);
            }
        });

        proceedings= (at.markushi.ui.CircleButton) findViewById(R.id.proceedings);
        proceedings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),ProceedingActivity.class);
                startActivity(i);
            }
        });

        transport= (at.markushi.ui.CircleButton) findViewById(R.id.transport);
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),TransportActivity.class);
                startActivity(i);
            }
        });

        sponsors= (at.markushi.ui.CircleButton) findViewById(R.id.sponsors);
        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),SponsorsActivity.class);
                startActivity(i);
            }
        });

        contactus=(at.markushi.ui.CircleButton)findViewById(R.id.contact);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),ContactActivity.class);
                startActivity(i);
            }
        });

        help= (at.markushi.ui.CircleButton) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),HelpActivity.class);
                startActivity(i);
            }
        });

        announcement= (at.markushi.ui.CircleButton) findViewById(R.id.announcement);
        announcement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),AnnounceActivity.class);
                startActivity(i);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(getBaseContext(),DevelopersActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
