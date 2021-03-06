package arturvasilov.udacity.nanodegree.popularmovies.fragment;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import arturvasilov.udacity.nanodegree.popularmovies.R;
import arturvasilov.udacity.nanodegree.popularmovies.app.Preferences;

/**
 * @author Artur Vasilov
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        getPreferenceManager().setSharedPreferencesName(Preferences.SETTINGS_NAME);
        getPreferenceManager().setSharedPreferencesMode(Context.MODE_PRIVATE);
        addPreferencesFromResource(R.xml.settings);
    }
}
