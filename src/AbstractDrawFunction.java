
import java.util.Scanner; 
public abstract class AbstractDrawFunction {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	double x = input.nextDouble();
	System.out.println("Please enter the value of x : \n" + x);
	
	x_2 x1 = new x_2();
	System.out.println(x1.toString() + "\n");
	sin_x x2 = new sin_x();
	System.out.println("f(x) = sin(x) = \n" + );
	cos_x x3 = new cos_x();
	System.out.println("f(x) = cos(x) = \n" + );
	System.out.println("f(x) = tan(x) = \n" + );
	System.out.println("f(x) = cos(x) + 5sin(x) = \n" + );
	System.out.println("f(x) = 5cos(x) + sin(x) = \n" + );
	System.out.println("f(x) = log(x) + x^2 = \n" + );
	
	}

}
class x_2 extends AbstractDrawFunction{
	
	
	public x_2(){
	super(x);
	}
	double end_x = Math.pow( x , 2 );
	public String toString(){
	return "f(x) = x^2 = " + x_2();
	}
	
}
class sin_x extends AbstractDrawFunction{
	super(x);
	double end_sin = Math.sin(x);
}

class cos_x extends AbstractDrawFunction{
	super(x);
	
}
class tan_x extends AbstractDrawFunction{
	super(x);
	
}
class cos_5sin_x extends AbstractDrawFunction{
	super(x);
	
}
class cos_sin_x extends AbstractDrawFunction{
	super(x);
	
}
class log_x extends AbstractDrawFunction{
	super(x);
	
}