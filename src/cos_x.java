
public class cos_x extends AbstractDrawFunction{
	//create function 3
	cos_x(){
		
	}
	
	double a;
	public cos_x(double x){
		a = x ;
	}
	
	@Override
	double f(double a){
		double end_x = Math.cos(a);
		return end_x;		
		//declare the function
	}

}
