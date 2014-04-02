
public class log_x extends AbstractDrawFunction{
	//create function 7
	log_x (){
		
	}
	double a;
	public log_x(double x){
		a = x ;
	}
	
	@Override
	double f(double a){
		double end_x = (Math.log(a)/Math.log(10) + (a*a));
		return end_x;
		//declare the function
	}

}
