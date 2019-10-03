class First
{
	public static void main (String[] xyz)
	{
		int Num; 
		Num = 27;

		if(Num>2000)
		{
			System.out.println("A");
			if(Num>3000)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("C");
				System.out.println("D");
			}
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
			if(Num>1000)
			{
				System.out.println("G");
				if(Num>1500)
				{
					System.out.println("I");
				}
				else
				{
					System.out.println("H");
				}	
				System.out.println("K");
			}
			else
			{
				System.out.println("L");
			}					
		}
	}
}

