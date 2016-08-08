package com.example.macbook.dayre;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


       /* *Created by Shivichu Home on 8/2/2016.
 */

public class CustomDialogClass extends Dialog {

    public Activity c;
    public Dialog d;


    int id;
    int day;
    int month;
    int year;
    int hour;
    int minute;
    String y, m, da, h, min;
    StringBuilder stringdate, stringtime;

    TextView cur_date, cur_time, new_date_set, new_time;
    Button add_reminder;


    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog_reminder);

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
        da = (String.valueOf(day));

        hour = c.get(Calendar.HOUR_OF_DAY);
        h = (String.valueOf(hour));
        minute = c.get(Calendar.MINUTE);
        min = (String.valueOf(minute));
        // tz=c.get(Calendar.AM_PM);


        stringdate = new StringBuilder().append(da).append("/").append(m).append("/").append(y);
        stringtime = new StringBuilder().append(hour).append(":").append(minute);


        cur_date.setText(stringdate);
        cur_time.setText(stringtime);

        new_date_set.setText(stringdate);
        new_time.setText(stringtime);


        new_date_set.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final Calendar c = Calendar.getInstance();
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                StringBuilder dateBuilder = new StringBuilder().append(dayOfMonth).append("/").append(monthOfYear + 1).append("/").append(year);
                                new_date_set.setText(dateBuilder);

                            }
                        }, year, month, day);
                datePickerDialog.show();
                return false;
            }
        });

        new_time.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                minute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(),
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                StringBuilder timeBuilder = new StringBuilder().append(hourOfDay).append(":").append(minute);
                                new_time.setText(timeBuilder);
                            }
                        }, hour, minute, false);
                timePickerDialog.show();

                return false;
            }
        });

        add_reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Inflate the Layout
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_layout_id));

                // Create Custom Toast
                Toast toast = new Toast(getContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
                finish_task();
            }
        });


    }

    private void finish_task() {
        c.finish();
    }

}




