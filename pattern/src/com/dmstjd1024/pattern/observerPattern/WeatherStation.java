package com.dmstjd1024.pattern.observerPattern;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 60, 30.4f);
	}

}
