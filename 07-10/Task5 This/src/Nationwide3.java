
public class Nationwide3 {
	public Nationwide3() {
		this(7, 9);
		System.out.println("A");
	}

	public Nationwide3(int A) {
		this();
		System.out.println("B");
	}
	public Nationwide3(int A, int B) {
		System.out.println("C");
	}
}