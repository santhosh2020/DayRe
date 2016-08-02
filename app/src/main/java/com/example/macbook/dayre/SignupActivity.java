package com.example.macbook.dayre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Shivichu Home on 7/21/2016.
 */
public class SignupActivity extends LoginActivity {


    EditText new_usrname, new_pwd, phno;
    Button verification;
    ImageView temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        temp = (ImageView) findViewById(R.id.temp_map);


        onVerify();
       // onviewtempmap();

    }

   /* private void onviewtempmap() {


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tempintent = new Intent(SignupActivity.this, CurrentlocationMapsactivity.class);
                startActivity(tempintent);
            }
        });

    }*/

    private void onVerify() {

        verification = (Button) findViewById(R.id.btn_verify);
        verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent verify_intent = new Intent(SignupActivity.this, OtpActivity.class);
                startActivity(verify_intent);

            }
        });

    }


}

