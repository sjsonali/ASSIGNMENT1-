class Q8a
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)						//print j pattern
			{

				for(int j=1; j<=7;j++)
				{
					if(i==1&&j==4||i==2&&j==3||i==2&&j==5||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==3&&j==5 ||i==3&&j==6||i==4&&j==1||i==4&&j==7)
						System.out.print("a");
					else
						System.out.print(" ");	
				}
					System.out.println();	

			}
	}
}