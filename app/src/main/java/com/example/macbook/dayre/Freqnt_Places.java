package com.example.macbook.dayre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Freqnt_Places extends AppCompatActivity {
    ListView freqnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freqnt__places);
        freqnt=(ListView)findViewById(R.id.list_remindr);
        String places[]=new String[]{"Bigleap","RailwayStation,Calicut","RailwayStation,Kannur","R.P Mall,Calicut"};
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,R.layout.freqnt_places_textview,R.id.textView1,places);
        freqnt.setAdapter(arrayAdapter1);
        freqnt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos=i;
                String itemvalue=(String)freqnt.getItemAtPosition(pos);
                switch (pos){
                    case 0:
                        Toast.makeText(Freqnt_Places.this,"   "+itemvalue,Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(Freqnt_Places.this,"   "+itemvalue,Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(Freqnt_Places.this,"    "+itemvalue,Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(Freqnt_Places.this,"   "+itemvalue,Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(Freqnt_Places.this,"    "+itemvalue,Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
