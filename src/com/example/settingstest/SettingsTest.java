package com.example.settingstest;

import org.junit.Test;
import static org.junit.Assert.*;

public class SettingsTest {

    @Test
    public void testDefaultAirplaneModeIsOff() {
        SettingsManager manager = new SettingsManager();
        assertFalse(manager.isAirplaneModeEnabled());
    }

    @Test
    public void testTurnOnAirplaneMode() {
        SettingsManager manager = new SettingsManager();
        manager.setAirplaneMode(true);
        assertTrue(manager.isAirplaneModeEnabled());
    }

    @Test
    public void testTurnOffAirplaneMode() {
        SettingsManager manager = new SettingsManager();
        manager.setAirplaneMode(true);
        manager.setAirplaneMode(false);
        assertFalse(manager.isAirplaneModeEnabled());
    }
}
