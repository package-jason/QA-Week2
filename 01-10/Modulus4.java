class Modulus4
{
	public static void main (String[] xyz)
	{
		int A,B;
		A=B=1;
		while (A<=10)
		{
			B=1;
			while(B<=A)
			{
				System.out.print(A);
				if(B<A){
					System.out.print(",");
				}
				else{
					System.out.println(".");
				}
				B=B+1;
			}
			A=A+1;
		}
	 }
}