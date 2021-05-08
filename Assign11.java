import java.lang.*;
import java.util.Scanner;
import java.io.*;


class Assign11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Radius:" );
		double a = sc.nextDouble();
		
		double perimeter=2*Math.PI*a;
		double area=Math.PI*a*a;
		
		System.out.println("Perimeter is:" + perimeter);

		System.out.println("Radius:"+ area);

		}
	}
