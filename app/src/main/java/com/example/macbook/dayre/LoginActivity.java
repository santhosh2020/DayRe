package com.example.macbook.dayre;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shivichu Home on 7/21/2016.
 */
public class LoginActivity extends AppCompatActivity {


    EditText user_name,pwd;
    Button signin;
    TextView new_usr;
    ImageView img;
    double lLat,lLon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);


        //getting current location and address
        GetLocationActivity getLocationActivity=new GetLocationActivity(getApplicationContext());
        getLocationActivity.getLocation();
        Location info = getLocationActivity.getLocation();

        lLat=getLocationActivity.latitude;
        lLon=getLocationActivity.longitude;

        if(info!=null)
        {
            /*NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

            Notification mBuilder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.ic_announcement_white_24dp).setContentTitle("DayRe").setContentText("New Notification").build();
            mBuilder.contentIntent= PendingIntent.getActivity(getApplication(),0,new Intent(getApplicationContext(),PopupNotification.class),PendingIntent.FLAG_UPDATE_CURRENT);


            notificationManager.notify(9999,mBuilder);

            Vibrator vibe=(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
            vibe.vibrate(250);*/
        }

        onSignin();
        onNewuserreg();
        popup();


    }

    private void onSignin() {


        signin=(Button)findViewById(R.id.btn_signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signin_intent=new Intent(LoginActivity.this,Home.class);
                startActivity(signin_intent);

            }
        });

    }

    private void popup() {
        img=(ImageView)findViewById(R.id.img_logo);

        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                //  Intent temp_pop=new Intent(LoginActivity.this,PopupNotification.class);
                // startActivity(temp_pop);
               /* NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

                Notification mBuilder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.ic_announcement_white_24dp).setContentTitle("DayRe").setContentText("New Notification").build();
                mBuilder.contentIntent= PendingIntent.getActivity(getApplication(),0,new Intent(getApplicationContext(),PopupNotification.class),PendingIntent.FLAG_UPDATE_CURRENT);


                notificationManager.notify(9999,mBuilder);

                Vibrator vibe=(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibe.vibrate(250);
*/
                return false;
            }
        });

    }

    private void onNewuserreg() {


        new_usr=(TextView)findViewById(R.id.txt_newreg);
        new_usr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent reg_intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(reg_intent);

            }
        });


    }


}
