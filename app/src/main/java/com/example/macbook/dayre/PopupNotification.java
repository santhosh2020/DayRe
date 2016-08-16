package com.example.macbook.dayre;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Shivichu Home on 7/21/2016.*/


public class PopupNotification extends AppCompatActivity {


   // Button rem_add;
    TextView txtlocation;
    double new_lat,new_lon;
    String new_address,new_city;
    FloatingActionButton fab_add ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);

        GetLocationActivity getLocationActivity=new GetLocationActivity(getApplicationContext());

        txtlocation=(TextView)findViewById(R.id.txt_pop_currentloc);
        fab_add=(FloatingActionButton) findViewById(R.id.fab_add_rem);
        fab_add.setImageResource(R.drawable.ic_add_circle_white_18dp_36);
        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClass cdd = new CustomDialogClass(PopupNotification.this);
                cdd.show();

            }
        });

        new_lat=getLocationActivity.latitude;
        new_lon=getLocationActivity.longitude;

        new_address=getLocationActivity.address;
        new_city=getLocationActivity.city;

        txtlocation.setText("Now you are at"+new_address+","+new_city);




    }
}

