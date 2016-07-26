package com.example.macbook.dayre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Remainder extends AppCompatActivity {
    ListView remdr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remainder);
        remdr=(ListView)findViewById(R.id.list_remindr);

        String time[]=new String[]{"7pm","3-4pm","11am","6-7am","10pm"};

        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,R.layout.rem_textview,R.id.textView1,time);

        remdr.setAdapter(arrayAdapter1);
    }
}