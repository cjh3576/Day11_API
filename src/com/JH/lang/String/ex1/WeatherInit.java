package com.JH.lang.String.ex1;

public class WeatherInit {
	private String info;
	public WeatherInit() {
		info = "seoul, 맑음, 10, 20, 0.3, Daejon, 비,  22, 50, 0.1, incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
	}

	public Weather[]  getWeathers() {
		int index =0;
		String [] ar = info.split(", ");
		Weather [] weathers = new Weather[10];

		for(int i=0;i<weathers.length+1;i++) {
			Weather w = new Weather();
			w.setCity(ar[i]);
			w.setState(ar[++i]);
			w.setTem(ar[++i]);
			w.setHum(ar[++i]);
			w.setDust(ar[++i]);
			weathers[index] = w;
			index++;
		}
		return weathers;


	}



}
