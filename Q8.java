class Q8
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)						//print j pattern
		{	

				for(int j=1; j<=4;j++)
				{
					if(i==1&&j==4||i==2&&j==4||i==3&&j==1||i==3&&j==4||i==4&&j==2||i==4&&j==3)
						System.out.print("j");
					else
						System.out.print(" ");	
				}

			
			
				for(int j=6; j<=12;j++)
				{
					if(i==1&&j==9||i==2&&j==8||i==2&&j==10||i==3&&j==7||i==3&&j==8||i==3&&j==9||i==3&&j==10 ||i==3&&j==11||i==4&&j==6||i==4&&j==12)
						System.out.print("a");
					else
						System.out.print(" ");	
				}

			
			

				for(int j=13; j<=19;j++)
				{
					if(i==1&&j==13||i==1&&j==19||i==2&&j==14||i==2&&j==18||i==3&&j==15||i==3&&j==17||i==4&&j==16)
						System.out.print("v");
					else
						System.out.print(" ");	
				}

			
			

				for(int j=21; j<=27;j++)
				{
					if(i==1&&j==24||i==2&&j==23||i==2&&j==25||i==3&&j==22||i==3&&j==23||i==3&&j==24||i==3&&j==25 ||i==3&&j==26||i==4&&j==21||i==4&&j==27)
						System.out.print("a");
					else
						System.out.print(" ");	
				}
					System.out.println();	
		}
	}
	
}