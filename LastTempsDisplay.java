import java.util.ArrayList;
import java.util.List;

public class LastTempsDisplay implements Observer, DisplayElement {
	
    private List <Double> temps = new ArrayList <> ();
    private int tempQuantity;
    
    public LastTempsDisplay(int tq){
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
        System.out.printf("Ultimas 10 temperaturas: ");
        for (var i = 0; i < temps.size(); i++){
            System.out.printf("%.2f; ", temps.get(i));
        }
        System.out.println("");
    }
}