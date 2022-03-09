package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.*;
import edu.kau.fcit.cpit252.weatherDB.*;

public class WeatherGeoAD implements WeatherGeo {

    String cityName;
    static WeatherGeoAD ad = null;
// private constructro for singleton porpose
    private WeatherGeoAD() {

    }
    
    
    
    
    // in case the user entered lat and long to get weather info
    public String getWeatherInfo(double latitude, double longitude) {
        // if the user enterd wrong lat and long values
        this.cityName = new GeoLocation().search(latitude, longitude);
        if (cityName == null) {
            return "City Not Found";
        }
        WeatherCity wdb = new WeatherDBI();
        return wdb.getWeatherInfo(cityName);
    }
    
    
    
    
    
    
    // in case the user entered the city name
    public String getWeatherInfo(String cityName) {
        WeatherCity wdb = new WeatherDBI();
        return wdb.getWeatherInfo(cityName);
    }

    
    
    
    public String getCityName() {
        return cityName;
    }

    
    
    
    
    //**Singlton**
    public static WeatherGeoAD getAdapterInstance() {
        if (ad == null) {
            ad = new WeatherGeoAD();
            return ad;
        }
        return ad;
    }

}
