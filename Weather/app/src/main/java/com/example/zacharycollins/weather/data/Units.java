package com.example.zacharycollins.weather.data;

import org.json.JSONObject;

/**
 * Created by Zachary.Collins on 3/15/2016.
 */
public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
