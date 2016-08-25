import java.util.Scanner;

public class Day16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try {
			int parsedInteger = Integer.parseInt(S);
			System.out.println(String.valueOf(parsedInteger));
		} catch (Exception e) {
			System.out.println("Bad String");
		}
		in.close();
	}
}
