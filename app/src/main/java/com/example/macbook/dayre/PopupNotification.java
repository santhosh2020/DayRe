/*
package com.example.macbook.dayre;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

*/
/**
 * Created by Shivichu Home on 7/21/2016.
 *//*

public class PopupNotification extends AppCompatActivity {

    private static final int DATE_DIALOG_ID = 4000;
    private static final int TIME_DIALOG_ID = 4001;
    NewReminderClass newReminderClass;
    int day;
    int month;
    int year;
    int hour;
    int minute;
    int set_year, set_month, set_day;
    int set_hour, set_minute;

    Button rem_add;
    Button add_reminder;
    TextView cur_date, cur_time, new_date_set, new_time;

    // private int tz;

    String y, m, d, h, min;
    StringBuilder stringdate, stringtime;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);


        rem_add = (Button) findViewById(R.id.add_rem);

*/
/*

        rem_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newReminderClass = new NewReminderClass();
            }
        });


    }


    class NewReminderClass {

        public NewReminderClass() {


            setContentView(R.layout.add_remainder_layout);

            cur_date = (TextView) findViewById(R.id.current_date);
            cur_time = (TextView) findViewById(R.id.current_time);
            new_date_set = (TextView) findViewById(R.id.set_date);
            new_time = (TextView) findViewById(R.id.set_time);
            add_reminder = (Button) findViewById(R.id.btn_add);


            //getting current date
            final Calendar c = Calendar.getInstance();
            year = c.get(Calendar.YEAR);
            y = (String.valueOf(year));
            month = c.get(Calendar.MONTH);
            m = (String.valueOf(month));
            day = c.get(Calendar.DATE);
            d = (String.valueOf(day));

            hour = c.get(Calendar.HOUR_OF_DAY);
            h = (String.valueOf(hour));
            minute = c.get(Calendar.MINUTE);
            min = (String.valueOf(minute));
            // tz=c.get(Calendar.AM_PM);


            stringdate = new StringBuilder().append(d).append("/").append(m).append("/").append(y);
            stringtime = new StringBuilder().append(hour).append(":").append(minute);


            cur_date.setText(stringdate);
            cur_time.setText(stringtime);

            new_date_set.setText(stringdate);
            new_time.setText(stringtime);

            add_reminder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Reminder Saved", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    PopupNotification.this.finish();
                }
            });


            new_date_set.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showDialog(DATE_DIALOG_ID);
                }
            });


            new_time.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog(TIME_DIALOG_ID);
                }
            });

        }
    }


    @Override
    protected Dialog onCreateDialog(int id) {

        if (id == DATE_DIALOG_ID) {

            //set date picker as current date


            return new DatePickerDialog(this, datePickerListener, year, month, day);


        } else if (id == TIME_DIALOG_ID) {
            return new TimePickerDialog(this, timePickerListener, hour, minute, false);
        }
        return null;


    }

    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {


        @Override
        public void onDateSet(DatePicker datePicker, int new_year, int new_month, int new_date) {

            set_year = new_year;
            set_month = new_month;
            set_day = new_date;

            StringBuilder mbuiilder = new StringBuilder().append(set_day).append("/").append(set_month).append("/").append(set_year);

            new_date_set.setText(mbuiilder);


        }


    };


    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {

        @Override
        public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {


            //getting the selected time
            set_hour = selectedHour;
            set_minute = selectedMinute;


            //setting the selected time to textview

            if (hour < 12 && hour >= 0) {

                StringBuilder d1Builder = new StringBuilder().append(pad(set_hour)).append(":").append(pad(set_minute));
                new_time.setText(d1Builder);

            } else {
                // set_hour = 12;
                if (set_hour == 0) {
                    set_hour = 12;
                }
                //setting current time to textview

                StringBuilder d2Builder = new StringBuilder().append(pad(set_hour)).append(":").append(pad(set_minute));

                new_time.setText(d2Builder);
            }


        }
    };


    private static String pad(int c) {

        if (c >= 10) {
            return String.valueOf(c);
        } else {
            return "0" + String.valueOf(c);
        }


    }


}

*/
