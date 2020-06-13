public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	
	@Override
	public void update (double temp, double humidity, double pressure) {
		display(temp, humidity, pressure);
	}
	
	@Override
	public void display(double t, double h, double p) {		
		System.out.printf("T: %.2f\nH: %.2f\nP: %.2f\n", t, h, p);
	}

}
