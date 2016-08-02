package com.example.macbook.dayre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Settings_DayRe extends AppCompatActivity {
    ListView lv;
    Integer[] icon={android.R.drawable.ic_menu_gallery};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings__day_re);
        lv=(ListView)findViewById(R.id.settings_list);

        String[] opt=new String[]{"THEME","LANGUAGE","NOTIFICATION","BACKUP","WIDGET","LIKE DAYRE? RATE IT","TELL YOUR FRIENDS","LIKE US ON FACEBOOK"};
      //  ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.custom_settings,R.id.cust_text,opt);

        CustomListAdapterSettings adapter=new CustomListAdapterSettings(this, opt, icon);
        lv.setAdapter(adapter);
    }
}
