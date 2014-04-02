
public class sin_x  extends AbstractDrawFunction{
	//create function 2
	sin_x(){
		
	}
	
	double a;
	public sin_x(double x){
		a = x;
	}
	
	@Override
	double f(double a){
		double end_x = Math.sin(a);
		return end_x;	
		//declare the function
	}
}
