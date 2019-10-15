
public class TestBank {
	public static void main(String XYZ[]) {
		Bank HSBC, Barclays, NBS;
		HSBC=new Bank();
		Barclays=new Bank();
		NBS=new Bank();
		Bank.Dollar=100;
		HSBC.Amount(2);
		NBS.Amount(3);
		Barclays.setDollar(200);
		HSBC.Amount(2);
		NBS.setDollar(500);
		Barclays.Amount(2);
	}
}
