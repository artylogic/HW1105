import java.util.Scanner;
public class AgeName {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = "Alex";
		int age = 0;
		String adress = "nowhere";
		

		System.out.println("Please enter your name : ");
		name = input.next(); 

		System.out.println("Please enter your age : ");
		age = input.nextInt(); 

		System.out.println("Please enter your address : ");
		adress = input.next(); 
		
		System.out.println("Hey! Your name is " + name +". You are "+ age +". And you live at " + adress +".");
	}

}
