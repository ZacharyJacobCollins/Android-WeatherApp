package com.example.zacharycollins.weather.service;

import com.example.zacharycollins.weather.data.Channel;

/**
 * Created by Zachary.Collins on 3/15/2016.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
