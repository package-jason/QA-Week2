
public class Nationwide {
	public static void main(String XYZ[]) {
		NationwideAccounts Ref=new NationwideAccounts();
		try {
			Ref.NetSalary(2000,12);
		}
		catch(AbsenteesException X) {
			System.out.println("Too many absentees");
		}
	}
}
