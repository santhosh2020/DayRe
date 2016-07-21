package com.example.macbook.dayre;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shivichu Home on 7/21/2016.
 */
public class OtpActivity extends SignupActivity {

    EditText otp;
    TextView resend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_activity);




        onOtpresend();

    }

    private void onOtpresend() {

        resend=(TextView)findViewById(R.id.txt_resend);
        resend.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                Toast toast=Toast.makeText(getApplicationContext(),"Resending OTP....",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

                return false;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
