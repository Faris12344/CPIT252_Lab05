package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {

    public static void main(String[] args) {
        //user will use the weatherAPI through the adapter in two methods (lat , long) and cityName 
        //in case user used lat and long the adapter will translate it to a city name to get weather info from WeatherDBI
        WeatherGeoAD adp = WeatherGeoAD.getAdapterInstance();
        String weaInfo = adp.getWeatherInfo(24.633333, 46.7166672);
        System.out.print(weaInfo);
        if (!weaInfo.equals("City Not Found")) {
            System.out.println(" is the Current Weather Info for:" + adp.getCityName() + " City");
        } 

        // Jeddah => 21.543333, 39.172778
    }
}
