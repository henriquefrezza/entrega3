public class Teste {

	public static void main(String[] args){
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = 
				new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = 
				new ForecastDisplay();
		StatsDisplay statsDisplay = 
				new StatsDisplay();
		AverageDisplay averageDisplay = 
				new AverageDisplay(10);
		LastTempsDisplay lastTempsDisplay = 
				new LastTempsDisplay(10);	
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		wd.registerObserver(averageDisplay);
		wd.registerObserver(lastTempsDisplay);
		wd.iniciar();
	}

}
