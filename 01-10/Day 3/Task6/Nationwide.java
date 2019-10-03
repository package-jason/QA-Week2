class Nationwide{
	public void Print(int A){
		switch(A){
			case 1:System.out.println("One"); break;
			case 2:System.out.println("Two"); break;
			case 3:System.out.println("Three"); break;
			case 4:System.out.println("Four"); break;
			case 5:System.out.println("Five"); break;
			case 6:System.out.println("Six"); break;
			case 7:System.out.println("Seven"); break;
			case 8:System.out.println("Eight"); break;
			case 9:System.out.println("Nine"); break;
			case 10:System.out.println("Ten"); break;
			default:break;
		}
	}

	public void Days(int A){
		switch(A){
			case 1: 
			case 3:
			case 5:System.out.println("We finih at 4"); break;
			case 2:
			case 4:System.out.println("We finih at 5"); break;
			default:System.out.println("Invalid Date"); break;
		}
	}
}