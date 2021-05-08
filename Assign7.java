import java.util.Scanner;
import java.lang.*;

class Assign7
{
public static void main(String args[])
{	
Scanner sc = new Scanner (System.in);

System.out.print("Input a number:" );
int a = sc.nextInt();
for(int i=1; i<=10;i++){
int c= a*i;
System.out.println(a+"x"+i+"="+c);}
}
}