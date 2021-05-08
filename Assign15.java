import java.lang.*;
import java.util.Scanner;

class Assign15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Input first number:");

		int a = sc.nextInt();
		System.out.println("Input second number:");

		int b = sc.nextInt();
		System.out.println("Before swaping number:" + a + " and "+ b);

		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping number:" + a +" and "+ b);
		}
		}
