import java.lang.*;
import java.util.Scanner;
import java.io.*;


class Assign13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Width:" );
		double a = sc.nextDouble();
		System.out.println("Height:" );
		double b = sc.nextDouble();
		double c=a*b;
		System.out.println("Area:" +c);
		double d=2*(a+b);
		System.out.println("Perimeter:" +d);
		}
	}

