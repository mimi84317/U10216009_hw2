
import java.util.Scanner; 
public abstract class AbstractDrawFunction {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	double x = input.nextDouble();
	
	
	System.out.println("Please enter the value of x : \n" + x);
	x_2 x1 = new x_2();
	System.out.println(x1.toString() + "\n");
	sin_x x2 = new sin_x();
	System.out.println(x2.toString() + "\n");
	cos_x x3 = new cos_x();
	System.out.println(x3.toString() + "\n");
	tan_x x4 = new tan_x();
	System.out.println(x4.toString() + "\n");
	cos_5sin_x x5 = new cos_5sin_x();
	System.out.println(x5.toString() + "\n");
	cos_sin_x x6 = new cos_sin_x();
	System.out.println(x6.toString() + "\n" );
	log_x x7 = new log_x();
	System.out.println(x7.toString() + "\n");
	
	}

}
class x_2 extends AbstractDrawFunction{
	
	
	public x_2(){
	}
	double end_x = Math.pow( x , 2 );
	public String toString(){
	return "f(x) = x^2 = " + end_x;
	}
	
}
class sin_x extends AbstractDrawFunction{
	
	public sin_x(){
	}
	double end_sin = Math.sin(x);
	public String toString(){
	return "f(x) = sin(x) =" + end_sin;
	}
}

class cos_x extends AbstractDrawFunction{
	
	public cos_x(){
	}
	double end_cos = Math.cos(x);
	public String toString(){
		return "f(x) = cos(x) = " + end_cos;
		}
}
class tan_x extends AbstractDrawFunction{
	
	public tan_x(){
	}
	double end_tan = Math.tan(x);
	public String toString(){
		return "f(x) = tan(x) = " + end_tan;
		}
}
class cos_5sin_x extends AbstractDrawFunction{
	
	public cos_5sin_x(){
	}
	double end_cos_5sin = Math.cos(x) + 5 * Math.sin(x);
	public String toString(){
		return "f(x) = cos(x) + 5sin(x) = " +end_cos_5sin;
		}
}
class cos_sin_x extends AbstractDrawFunction{
	
	public cos_sin_x(){
	}
	double end_cos_sin = 5 * Math.cos(x) + Math.sin(x);
	public String toString(){
		return "f(x) = 5cos(x) + sin(x) = " + end_cos_sin;
		}
}
class log_x extends AbstractDrawFunction{
	
	public log_x(){
	}
	double end_log = Math.log(x);
	public String toString(){
		return "f(x) = log(x) + x^2 = " + end_log;
		}
}