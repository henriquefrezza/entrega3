import java.util.ArrayList;
import java.util.List;

public class AverageDisplay implements Observer, DisplayElement {
	
    private List <Double> temps = new ArrayList <> ();
    private int tempQuantity;
    
    public AverageDisplay(int tq){
        tempQuantity = tq;
    } 
    
    private void addTemp (double temp) {
        temps.add(temp);
        if (temps.size() > tempQuantity) temps.remove(0);
    }
    
    @Override
	public void update (double temp, double humidity, double pressure) {
        addTemp(temp);
        display(temp, humidity, pressure);
	}
	
	@Override
	public void display(double t, double h, double p) {
        System.out.printf("Media das ultimas 10 temperaturas: %.2f\n", calculaMedia());
    }
    
    private double calculaMedia () {
		double soma = 0;
		for (Double temp : temps)
			soma += temp;
		return soma / temps.size();
	}
}
