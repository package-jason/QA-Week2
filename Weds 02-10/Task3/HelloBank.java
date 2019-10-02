class HelloBank {
	public static void main(String x[]) {
		Nationwide X = new Nationwide();
		X.hello();
		X.message();
		X.A=15;
				System.out.println(X.A);

	}
}

class Bank{
	public int A;
	public void message(){
		System.out.println("hello");
	}
}

class Nationwide extends Bank{
	public void hello(){
		System.out.println("Nationwide");
		A=20;
	}
}