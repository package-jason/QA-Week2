
public class Exception2 {
	public static void main(String XYZ[]) {
		int Result;

		try {
			Result = 4 / 0;
			System.out.println("Result: " + Result);
		} catch (ArithmeticException E) {
			System.out.println("Please do not divide by zero");
		}
	}
}
// The try statement specifies that this block of code must be tested for errors 
// while it is being executed.

// The catch statement specifies that this block of code a block of code to be executed,
// if an error occurs in the try block.

