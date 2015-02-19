package com.example.roman.safealerts;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

/**
 * Created by roman on 1/29/15.
 */
public class SettingActivity extends PreferenceActivity
        implements Preference.OnPreferenceChangeListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }
}
