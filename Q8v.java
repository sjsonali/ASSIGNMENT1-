class Q8v
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)						//print j pattern
			{

				for(int j=1; j<=7;j++)
				{
					if(i==1&&j==1||i==1&&j==7||i==2&&j==2||i==2&&j==6||i==3&&j==3||i==3&&j==5||i==4&&j==4)
						System.out.print("v");
					else
						System.out.print(" ");	
				}
					System.out.println();	

			}
	}
}