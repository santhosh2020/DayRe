package com.example.macbook.dayre;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shivichu Home on 7/21/2016.
 */
public class PopupNotification extends AppCompatActivity {

    Button rem_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);

        onAddreminder();

    }

    private void onAddreminder() {

        rem_add=(Button)findViewById(R.id.add_rem);

        rem_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });



    }
}
