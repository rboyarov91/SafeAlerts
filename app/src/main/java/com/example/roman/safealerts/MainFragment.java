package com.example.roman.safealerts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {
    private ImageButton alertImageButton;
    private LinearLayout alarmLinearLayout;
    private LinearLayout locationLinearLayout;
    private LinearLayout settingsLinearLayout;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        alertImageButton = (ImageButton)rootView.findViewById(R.id.alarmImageButton);
        alarmLinearLayout = (LinearLayout)rootView.findViewById(R.id.alarmLinearLayout);
        locationLinearLayout = (LinearLayout)rootView.findViewById(R.id.locationLinearLayout);
        settingsLinearLayout = (LinearLayout)rootView.findViewById(R.id.settingsLinearLayout);


        alarmLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alarmsIntent = new Intent(getActivity(),Alarms.class);
                startActivity(alarmsIntent);

            }
        });
        locationLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationIntent = new Intent(getActivity(),LocationAlerts.class);
                startActivity(locationIntent);
            }
        });
//        settingsLinearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent settingsIntent = new Intent(getActivity(),SettingActivity.class);
//                startActivity(settingsIntent);
//            }
//        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}