class Salary {
	public static void main(String x[]) {
		Account AC=new Account();
		String Name;
		int Salary;
		float Tax,Net;

		Name="James";
		Salary=1000;

		Net=Salary-AC.Tax(Salary);

		System.out.println("Name: "+Name);
		System.out.println("Salary: "+Salary);
		System.out.println("Net: "+Net);

	}
}


