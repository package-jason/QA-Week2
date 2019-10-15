
public class Exception3 {
	public static void main(String XYZ[]) {
		String No1, No2;
		float Result;
		No1 = "6";
		No2 = "A0";

		try {
			Result = Integer.parseInt(No1) / Integer.parseInt(No2);
			System.out.println("Result is: " + Result);
		} catch (ArithmeticException E) {
			ExceptionHandling.forDivisionByZero();
		} catch (NumberFormatException E) {
			ExceptionHandling.forNotNumber();
			// putting a letter in No1 or No2 will result in forNotNumber error
		} catch (Exception E) {
			System.out.println("System went wrong");
		}
	}
}
