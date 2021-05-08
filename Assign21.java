import java.lang.*;
import java.util.Scanner;

class Assign21 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("First Number:" );
		int a = sc.nextInt();
				
		int count =0;
		int dec =0;

		int remainder;
		String str ="";
		while(a!=0) {
			remainder=a%8;
			a=a/8;
			str = remainder+str;
}
			System.out.println("Octal number = " +str);

}
}