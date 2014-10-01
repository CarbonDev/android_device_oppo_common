package com.cyanogenmod.settings.device;

import android.view.MenuItem;
import com.cyanogenmod.settings.device.utils.NodePreferenceActivity;
import com.cyanogenmod.settings.device.utils.HwKeysPreference;

import android.os.Bundle;

public class HardKeysSettings extends NodePreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.hardkeys_panel);
        ((HwKeysPreference) findPreference("hw_keys")).checkSupport();
    }

}