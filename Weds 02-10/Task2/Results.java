class Results {
	public static void main(String x[]) {
	Exam School=new Exam(400);
	Exam College=new Exam(600);
	School.ShowResults(500);
	College.ShowResults(500);
	}
}

class Exam{
	private int TotalMarks;
	public Exam(int marks){
		TotalMarks=marks;
	}
	public void ShowResults(int marksObtained){
		float Per=(float) marksObtained*100/TotalMarks;
		if(Per>=60){
			System.out.println("You have passed the exam");
		}
		else{
			System.out.println("You have failed the exam");
		}
	}
}