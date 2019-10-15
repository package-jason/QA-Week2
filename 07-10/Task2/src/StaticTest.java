
public class StaticTest {
	static int A;
	public static void Boom() {
		A=5;
		System.out.println(A);
	
	}
}

// if int A wasn't static, it can't make a reference as it would be non-static 