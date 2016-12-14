package com.example.coolweather.gson;

/**
 * Created by zhangliyong on 16-12-14.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
