package com.example.macbook.dayre;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Vibrator;
import android.support.v7.app.NotificationCompat;

public class DayreReceiver extends BroadcastReceiver {
    public DayreReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        GetLocationActivity getLocationActivity=new GetLocationActivity(context);
        Location info = getLocationActivity.getLocation();
        if(info!=null)
        {
            NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

            Notification mBuilder=new NotificationCompat.Builder(context).setSmallIcon(R.drawable.ic_announcement_white_24dp).setContentTitle("DayRe").setContentText("New Notification").build();
            mBuilder.contentIntent= PendingIntent.getActivity(context,0,new Intent(context,PopupNotification.class),PendingIntent.FLAG_UPDATE_CURRENT);


            notificationManager.notify(9999,mBuilder);

            Vibrator vibe=(Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);
            vibe.vibrate(250);
        }




        //  throw new UnsupportedOperationException("Not yet implemented");
    }
}
