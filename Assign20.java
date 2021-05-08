import java.lang.*;
import java.util.Scanner;

class Assign20 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("First Number:" );
		int num = sc.nextInt();
				
		String str = "";
		char a[] = {'0', '1', '2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem;
		
		while(num!=0) {
			rem=num%16;
			num=num/16;
			str = a[rem]+str;
			}
			System.out.println("Hexadecimal number = " +str);

}
}