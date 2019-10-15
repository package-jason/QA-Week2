
public class NationwideAccounts {
	public void NetSalary(int Salary, int Absentees) throws AbsenteesException{
		float Tax=0, Net=0;
		if(Absentees>5) {
			AbsenteesException E1=new AbsenteesException();
			throw E1;
		}
		
		Tax = Salary*21/100;
		Net = Salary-Tax;
		System.out.println("Net Salary is " +Net);
	}
}
