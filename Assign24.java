import java.lang.*;
import java.util.Scanner;

class Assign24 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("First Binary Number:" );
		int num1 = sc.nextInt();
		
		
		int count1=0;
		int rem1;
		int dec1=0;
		while(num1!=0)
		{
			rem1=num1%10;
			num1/=10;
			dec1+=rem1*(int)Math.pow(2,count1++);
		}
		

		int remainder;
		String str ="";
		while(dec1!=0) {
			remainder=dec1%8;
			dec1=dec1/8;
			str = remainder+str;
}
			System.out.println("Octal number = " +str);

}
}