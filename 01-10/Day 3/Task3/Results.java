class Results{
	int phys,chem,math;

	private float Total, Per;

	private void doCalculations(){
		Total=phys+chem+math;
		Per=Total*100/450;
	}

	public void showResults(){
		doCalculations();
		System.out.println("Total Maths: "+Total);
		System.out.println("Percentage: " +Per);
	}
}
