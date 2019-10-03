class Account{
	public void TaxCalculation(int salary){
		float Tax;
		Tax=salary*21/100;
		System.out.println("You Tax is "+Tax);
	}
	public float Tax(int salary){
		float T=salary*21/100;
		return T;
	}
}