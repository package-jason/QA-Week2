class Accounts {
	public static void main(String x[]) {
	TaxMan AC=new TaxMan();
	AC.Tax();
	AC.Tax(2000);
	AC.Tax(3000,15);
	}
}

class TaxMan{
	public void Tax(){
		System.out.println("Tax Rate: " +21);
	}
	public void Tax(int Salary){
		float T=(float)Salary*21/100;
		System.out.println("Your Tax is: "+T);
	}
	public void Tax(int Salary, int Rate){
		float T=(float)Salary*Rate/100;
		System.out.println("Your Tax is: "+T);
	}
	
}


