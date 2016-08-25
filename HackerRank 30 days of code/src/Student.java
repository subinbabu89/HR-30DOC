
public class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
	}

	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public String calculate() {
		int sum = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		int avg = sum / testScores.length;
		if(avg>=90){
			return "O";
		}else if(avg>=80){
			return "E";
		}else if(avg>=70){
			return "A";
		}else if(avg>=55){
			return "P";
		}else if(avg >=40){
			return "D";
		}else{
			return "T";
		}
	}

}
