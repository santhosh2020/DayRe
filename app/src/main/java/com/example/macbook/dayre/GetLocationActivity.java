package com.example.macbook.dayre;

import android.content.Context;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

/**
 * Created by Shivichu Home on 8/11/2016.
 */
public class GetLocationActivity implements LocationListener {

    private final Context mContext;
    Location location;
    double latitude; // latitude
    double longitude; // longitude
    LocationManager locationManager;
    String mprovider;
    String address;
    String city;
    String state;
    String knownName;


    public GetLocationActivity(Context context) {
        this.mContext = context;
        getLocation();
    }

    public Location getLocation() {

        try {
            locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
            Criteria criteria = new Criteria();

            mprovider = locationManager.getBestProvider(criteria, false);

            if (mprovider != null && !mprovider.equals("")) {
                 location = locationManager.getLastKnownLocation(mprovider);
                locationManager.requestLocationUpdates(mprovider, 5000, 1, this);


            }
            if (location != null) {
                onLocationChanged(location);
            }
            else
            {
                Toast.makeText(mContext.getApplicationContext(), "No Location Provider Found", Toast.LENGTH_SHORT).show();
        }
        } catch (Exception e) {
            e.printStackTrace();

        }

    return location;
}




    @Override
    public void onLocationChanged(Location location) {
        Geocoder geocoder;
        geocoder = new Geocoder(mContext.getApplicationContext(), Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5
            address = addresses.get(0).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
            city = addresses.get(0).getLocality();
            state = addresses.get(0).getAdminArea();
            String postalCode = addresses.get(0).getPostalCode();
            knownName = addresses.get(0).getFeatureName();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
