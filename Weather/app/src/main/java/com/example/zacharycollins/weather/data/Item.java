package com.example.zacharycollins.weather.data;

import org.json.JSONObject;

/**
 * Created by Zachary.Collins on 3/15/2016.
 */
public class Item implements JSONPopulator {
    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}
