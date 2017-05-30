import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number9 = input.nextDouble();

		System.out.print("Enter second number: ");
		double notDouble = input.nextDouble();

		double product = number9;
		
		
		System.out.printf("The numbers is: %f, %f", product, notDouble);
	}
}
