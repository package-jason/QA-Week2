public class QAmaths {
	public static void main(String XYZ[]) {
		int No1, No2;
		float Result = 0;
		String Sign;

		try {
			No1 = Integer.parseInt(XYZ[0]);
			No2 = Integer.parseInt(XYZ[2]);
			Sign = XYZ[1];
			if (Sign.equals("/")) {
				Result = No1 / No2;
			}
			//System.out.println("Result: " + Result);
			if (Sign.equals("+")) {
				Result = No1 + No2;
			}
			//System.out.println("Result: " + Result);
			if (Sign.equals("-")) {
				Result = No1 - No2;
			}
			//System.out.println("Result: " + Result);
			if (Sign.equals("x")) {
				Result = No1 * No2;
			}
			System.out.println("Result: " + Result);

		} catch (

		ArrayIndexOutOfBoundsException X) {
			System.out.println("Please send three values my friend");
		} catch (ArithmeticException Y) {
			System.out.println("Please do not divide by zero my friend");
		} catch (NumberFormatException Z) {
			System.out.println("Please enter digits only my friend");
		}
	}
}
