package com.example.settingstest;

public class SettingsManager {
    private boolean isAirplaneModeEnabled = false;

    public boolean isAirplaneModeEnabled() {
        return isAirplaneModeEnabled;
    }

    public void setAirplaneMode(boolean enabled) {
        this.isAirplaneModeEnabled = enabled;
    }
}
