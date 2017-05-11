import java.util.Scanner;
public class PhoneCalls {
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		
		double c1 = 0;
		double c2 = 0;
		double c3 = 0;
		
		double t1 = 0;
		double t2 = 0;
		double t3 = 0;
		
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		
		System.out.println("Please enter your first call price (in units): ");
		c1 = input1.nextDouble(); 
		System.out.println("Please enter your first call duration (in minutes): ");
		t1 = input1.nextDouble(); 
		System.out.println("Your first call price (in units) is: " + (c1*t1));
		sum1 = c1*t1;
		
		System.out.println("Please enter your 2nd call price (in units): ");
		c2 = input1.nextDouble(); 
		System.out.println("Please enter your 2nd call duration (in minutes): ");
		t2 = input1.nextDouble(); 
		System.out.println("Your 2nd call price (in units) is: " + (c2*t2));
		sum2 = c2*t2;

		System.out.println("Please enter your 3rd call price (in units): ");
		c3 = input1.nextDouble(); 
		System.out.println("Please enter your 3rd call duration (in minutes): ");
		t3 = input1.nextDouble(); 
		System.out.println("Your 3rd call price (in units) is: " + (c3*t3));
		sum3 = c3*t3;
		
		System.out.println("Your overall expences on 3 calls (in units) are: " + (sum1+sum2+sum3));
		
		
	}

}
