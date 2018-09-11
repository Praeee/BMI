import java.util.*;
class BMI
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		  System.out.print("Enter Height (cm) : ");
		    double h = sc.nextDouble();
		  System.out.print("enter Weight (kg) : ");
		    double s = h/100;
		    double w = sc.nextDouble();
		    double b = w/(s*s);
		  System.out.print("BMI : "+b);


	}
}