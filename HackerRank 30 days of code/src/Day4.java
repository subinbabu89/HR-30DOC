import java.util.Scanner;

public class Day4 {
	public static class Person {
		private int age;

		public Person(int initialAge) {
			if (initialAge < 0) {
				System.out.println("Age is not valid, setting age to 0.");
				age = 0;
			} else {
				age = initialAge;
			}
		}

		public void amIOld() {
			String statement = null;
			if (age < 18) {
				if (age < 13) {
					statement = "You are young.";
				}
				if (age >= 13 && age < 18) {
					statement = "You are a teenager.";
				}
			} else {
				statement = "You are old.";
			}
			System.out.println(statement);
		}

		public void yearPasses() {
			age++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}

}
