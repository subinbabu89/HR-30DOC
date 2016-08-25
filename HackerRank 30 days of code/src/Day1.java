import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		int j;
		double e;
		String r = null;

		j = scan.nextInt();
		e = scan.nextDouble();
		r = scan.next();

		System.out.println(i + j);
		System.out.println(d + e);
		System.out.println(s + r);
		scan.close();
	}
}
