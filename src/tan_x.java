
public class tan_x extends AbstractDrawFunction{
	//create function 4
	tan_x(){
		
	}
	
	double a;
	public tan_x(double x){
		a = x ;
	}
	
	@Override
	double f(double a){
		double end_x = Math.tan(a);
		return end_x;		
		//declare the function
	}
}
