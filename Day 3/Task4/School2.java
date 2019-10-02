class School2{
	private int phys, chem, math;
	private int invalid, failPhys,failChem,failMath;

	private float Total, Per;
	public void physics(int A){
		if(A>=0 & A<=150){
			phys = A;
			if(A<60){
				failPhys=1;
			}
		}
		else{
		System.out.println("Invalid Physics Marks");
		invalid = 1;
		}
	}
	public void chemistry(int B){
		if(B>=0 & B<=150){
			chem = B;
			if(B<60){
				failChem=1;
			}
		}
		else{
		System.out.println("Invalid chemistry Marks");
		} //comment
	}
	public void maths(int C){
		if(C>=0 & C<=150){
			math = C;
			if(C<60){
				failMath=1;
			}
		}
		else{
		System.out.println("Invalid Physics Marks");
		}
	}
	

	public void showResults(){
		if(invalid==0){
			Total=phys+chem+math;
			Per=Total*100/450;
			System.out.println("Total Maths: "+Total);
			System.out.println("Percentage: " +Per +"%");
			if(failPhys+failChem+failMath==0){
				System.out.println("Congratulations my friend! You have passsed all of your exams.");
			}
			if(failPhys+failChem+failMath==1){
				System.out.print("You must retake: ");
				if(failPhys==1){
					System.out.print("Physics");
				}
				if(failChem==1){
					System.out.print("Chemistry");
				}
				if(failMath==1){
					System.out.print("Maths");
				}
			}
			if(failPhys+failChem+failMath==2){
				System.out.println("Repeat the course");
			}
			if(failPhys+failChem+failMath==3){
				System.out.println("Go home");
			}
		}
		else{
			System.out.println("Invalid results, cannot calculate.");
		}

		
	}
}


