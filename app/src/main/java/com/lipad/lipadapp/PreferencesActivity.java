package com.lipad.lipadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jaredrummler.cyanea.app.CyaneaAppCompatActivity;
import com.jaredrummler.cyanea.prefs.CyaneaSettingsActivity;

public class PreferencesActivity extends CyaneaSettingsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }
}
