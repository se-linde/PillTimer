package com.example.pilltimer

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

class SettingsActivityFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(SavedInstanceState: Bundle?, rootkey: String?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        addPreferencesFromResource(R.xml.preferences)

    }
}