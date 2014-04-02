
public class cos5_sin_x extends AbstractDrawFunction{
	//create function 6
	cos5_sin_x(){
		
	}
	
	double a;
	public cos5_sin_x(double x){
		a = x ;
	}
	
	@Override
	double f(double a){
		double end_x = (Math.cos(a)*5 + Math.sin(a));
		return end_x;		
		//declare the function
	}

}
