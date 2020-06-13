import java.util.ArrayList;
import java.util.List;

public class StatsDisplay implements Observer, DisplayElement{
	
	private List <Double> temps = new ArrayList <> ();
	
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display (temp, humidity, pressure);
	}
	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Média: %.2f\n", calculaMedia());
	}
	
	private double calculaMedia () {
		double soma = 0;
		for (Double temp : temps)
			soma += temp;
		return soma / temps.size();
	}
}
