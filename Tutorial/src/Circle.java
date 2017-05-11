import java.util.Scanner;
public class Circle {
	static Scanner input = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("Enter the radius: ");
	      double radius = input.nextDouble();
	      double area = Math.PI * (radius * radius);
	      System.out.println("The area of the circle is: " + area);
	      double perimeter= Math.PI * 2 * radius;
	      System.out.println( "The perimeter of the circle is: "+ perimeter) ;
	   }
}
