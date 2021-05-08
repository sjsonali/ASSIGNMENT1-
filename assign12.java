import java.lang.*;
import java.util.Scanner;

class assign12
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter first number");
		int a = sc.nextInt();
	
		System.out.println("enter second number");
		int b = sc.nextInt();
		
		System.out.println("enter third number");
		int c = sc.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("Average number is " + avg );
	}
}