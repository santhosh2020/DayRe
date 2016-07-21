package com.example.macbook.dayre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shivichu Home on 7/21/2016.
 */
public class SignupActivity extends LoginActivity {


    EditText new_usrname,new_pwd,phno;
    Button verification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);



        onVerify();

    }

    private void onVerify() {

        verification=(Button)findViewById(R.id.btn_verify);
        verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent verify_intent=new Intent(SignupActivity.this,OtpActivity.class);
                startActivity(verify_intent);

            }
        });

    }


}

