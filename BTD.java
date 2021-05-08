import java.lang.*;
import java.util.Scanner;

class BTD {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("First Number:" );
		int a = sc.nextInt();
		System.out.println("Second Number" );
		int b = sc.nextInt();
		
		long binaryNumber =0;
		int remainder, i=1;
		
		while(a!=0) {
			remainder=a%2;
			a=a/2;
			binaryNumber=binaryNumber+remainder*i;
			i=i*10;
			System.out.println("a" +binaryNumber);

		}
		long binaryNum =0;
		int rem, j=1;
		while(b!=0) {
			rem=b%2;
			b=b/2;
			binaryNum=binaryNum+rem*j;
			j=j*10;
			System.out.println("b" +binaryNum);

		}
			System.out.println("a = " +binaryNumber);
			System.out.println("b = " +binaryNum);
			if (a==0&b==0|a==0&)


	}
}
