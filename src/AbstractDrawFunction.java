import java.util.Scanner; 
import java.lang.Math;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;


public abstract class AbstractDrawFunction extends JPanel {
	//create the main class
	

	public static void main(String[] args){
		
		System.out.println("Please enter the x");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
		double x = input.nextDouble();
		
		System.out.println("The answer of f(x) = Math.pow(x, 2) is " + new x_2().f(x) );
		System.out.println("The answer of f(x) = sin(x) is " + new sin_x().f(x));	
		System.out.println("The answer of f(x) = cos(x) is " + new cos_x().f(x));	
		System.out.println("The answer of f(x) = 5sin(x) + cos(x) is " + new tan_x().f(x));
		System.out.println("The answer of f(x) = sin(x) + 5cos(x) is " + new cos_sin5_x().f(x));
		System.out.println("The answer of f(x) = 5sin(x) + cos(x) is " + new cos5_sin_x().f(x));
		System.out.println("The answer of f(x) = logx + Math.pow(x, 2) is" + new log_x().f(x));
		
		//invoke the result
		}
	
	
	private Polygon p = new Polygon();
	protected AbstractDrawFunction() {
		drawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction() {
		//create the function
		for (int x = -100; x <= 100; x++) {
			p.addPoint(x + 200, 200 - (int) f(x));
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	}
}
