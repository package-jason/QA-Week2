class ForLoop3
{
	public static void main (String[] xyz)
	{
		int Bill, Paid, balance, NotesQty;
		Bill=1;
		Paid=50;
		balance=Paid-Bill;

		System.out.println("Bill due \u00A3" + Bill);
		System.out.println("Amount paid \u00A3" + Paid);
		System.out.println("---------------");
		System.out.println("Change due: \u00A3" + balance);
			if(balance>=50)
			{
				NotesQty = 0;
				NotesQty = balance/50;
				System.out.println("\u00A350 note: " + NotesQty);
				balance -= (NotesQty * 50);
			}
			if(balance>=20)
			{
				NotesQty = 0;
				NotesQty = balance/20;
				System.out.println("\u00A320 note: " + NotesQty);
				balance -= (NotesQty * 20);
			}
			if(balance>=10)
			{
				NotesQty = 0;
				NotesQty = balance/10;
				System.out.println("\u00A310 note: " + NotesQty);
				balance -= (NotesQty * 10);
			}
			if(balance>=5)
			{
				NotesQty = 0;
				NotesQty = balance/5;
				System.out.println("\u00A35 note: " + NotesQty);
				balance -= (NotesQty * 5);
			}	
			if(balance>=2)
			{
				NotesQty = 0;
				NotesQty = balance/2;
				System.out.println("\u00A32 note: " + NotesQty);
				balance -= (NotesQty * 2);
			}
	
		
	 }
}