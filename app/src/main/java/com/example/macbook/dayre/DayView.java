package com.example.macbook.dayre;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by AK$HAY on 7/20/2016.
 */
public class DayView extends AppCompatActivity {
    Button btn_prev,btn_current,btn_nxt;
    ListView listactivity;
    ArrayAdapter<String> adapter_current,adapter_prev,adapter_next,adapter;
    TextView date,day;
    String month;

    TextView txtcurrentdate;

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dayview);
        btn_prev=(Button)findViewById(R.id.btn_prev);
        btn_current=(Button)findViewById(R.id.btn_curnt);
        btn_nxt=(Button)findViewById(R.id.btn_nxt);
        //
        txtcurrentdate=(TextView)findViewById(R.id.date);
        String new_date=getIntent().getExtras().getString("current");
        txtcurrentdate.setText(new_date);

        listactivity=(ListView)findViewById(R.id.list_activities);
       // date=(TextView)findViewById(R.id.day_month);
       // day=(TextView)findViewById(R.id.date_day);
        String current_values[]=new String[] {"BigLeap" , "Calicut"};
        String prev_values[]=new String[]{"Home","College"};
        String next_values[]=new String[]{"Office","Shopping"};
        adapter_current=new ArrayAdapter<String>(this,R.layout.custom_list_day_activity,R.id.textView2,current_values);
        adapter_prev=new ArrayAdapter<String>(this,R.layout.custom_list_day_activity,R.id.textView2,prev_values);
        adapter_next=new ArrayAdapter<String>(this,R.layout.custom_list_day_activity,R.id.textView2,next_values);
        listactivity.setAdapter(adapter_current);
        /*Intent get_date=getIntent();
        String year=Integer.toString(getIntent().getExtras().getInt("yr"));
        String get_day=Integer.toString(getIntent().getExtras().getInt("day"));
        month=get_date.getExtras().getString("month");*/
       /*if(month.equals(7))
        {
            date.setText("July " + year);
            day.setText(get_day);
        }
        //String month=Integer.toString(getIntent().getExtras().getInt("month"));
        /*switch (month)
        {
            case "7" : date.setText("July " + year);
            day.setText(get_day);
        }
       */
       // date.setText(month +" " + year);
       // day.setText(get_day);
        btn_current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listactivity.setAdapter(adapter_current);
            }
        });
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listactivity.setAdapter(adapter_prev);
            }
        });
        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listactivity.setAdapter(adapter_next);
            }
        });

    }






}
