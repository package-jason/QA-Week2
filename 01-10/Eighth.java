class Eighth
{
	public static void main (String[] xyz)
	{

		String Name; 
		int Salary = 2100;
		float Tax = 0;




		if(Salary>1500)
		{
			Tax = Salary * 21/100;
			float Net = Salary - Tax;
	
			System.out.println("Salary: \u00A3" + Salary);
			System.out.println("Tax: \u00A3" + Tax);
			System.out.println("Net: \u00A3" + Net); 


		}
		else
		{
			System.out.println("No Tax");
		}

	}
}




