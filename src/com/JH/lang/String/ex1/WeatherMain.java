package com.JH.lang.String.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInit wi = new WeatherInit();
		Weather[] we = wi.getWeathers();
		
		for(int i = 0; i<we.length; i++) {
			System.out.println(we[i].getCity());
			System.out.println(we[i].getState());
			System.out.println(we[i].getTem());
			System.out.println(we[i].getTem());
			System.out.println(we[i].getHum());
			System.out.println(we[i].getDust());
		}
	}

	
}
