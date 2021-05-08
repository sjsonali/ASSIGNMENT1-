import java.lang.*;
import java.util.Scanner;

class Assign5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Input first number:");

		int a = sc.nextInt();
		System.out.println("Input second number:");

		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Expected Output:");

		System.out.println(a+"x"+b +"=" +c);
	}
}