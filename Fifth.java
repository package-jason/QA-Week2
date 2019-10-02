class Fifth{
	public static void main (String[] xyz){

	String Name; 
	int Salary;
	float Tax = 0;
	float Net;

	Name = "Peter";
	Salary = 2000;

	if(Salary>=2000)
		Tax = Salary * 21/100;
	if(Salary<2000)	
		Tax = Salary * 15/100;

	Net = Salary - Tax;

	System.out.println("Name: " + Name);
	System.out.println("Tax: " + Tax);
	System.out.println("Net: " + Net);

	}
	}





	