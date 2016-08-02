package com.example.macbook.dayre;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Akshay on 2/8/2016.
 */
public class CustomListAdapterSettings extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] opt;
    private final Integer[] icon;

    public CustomListAdapterSettings(Activity context,String[] opt,Integer[] icon){
        super(context,R.layout.custom_settings,opt);
        this.context=context;
        this.opt=opt;
        this.icon=icon;

    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_settings, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.cust_text);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.cust_image);
        txtTitle.setText(opt[position]);
      //  imageView.setImageResource(icon[position]);
        return rowView;

    };

}
