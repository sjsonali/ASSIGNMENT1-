import java.lang.*;
import java.util.Scanner;

class Assign19 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("First Number:" );
		int a = sc.nextInt();
				
		long binaryNumber =0;
		int remainder, i=1;
		
		while(a!=0) {
			remainder=a%2;
			a=a/2;
			binaryNumber=binaryNumber+remainder*i;
			i=i*10;
}
			System.out.println("a = " +binaryNumber);

}
}