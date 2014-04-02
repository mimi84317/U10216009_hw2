
public class cos_sin5_x extends AbstractDrawFunction{
	//create function 5
	cos_sin5_x(){
		
	}
	
	double a;
	public cos_sin5_x(double x){
		a = x ;
	}
	
	@Override
	double f(double a){
		double end_x = (Math.cos(a) + Math.sin(a)*5);
		return end_x;		
		//declare the function
	}

}
