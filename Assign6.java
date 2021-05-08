import java.lang.*;
import java.util.Scanner;

class Assign6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Input first number:");

		int a = sc.nextInt();
		System.out.println("Input second number:");

		int b = sc.nextInt();
		System.out.println("Expected Output:");

		int c = a+b;
		System.out.println(a+"+"+b +"=" +c);
		
		int d = a-b;
		System.out.println(a+"-"+b +"=" +d);
		
		int e = a*b;
		System.out.println(a+"x"+b +"=" +e);
		
		int f = a/b;
		System.out.println(a+"/"+b +"=" +f);
		
		int g = a%b;
		System.out.println(a+"mod"+b +"=" +g);
		
		
		
	}
}