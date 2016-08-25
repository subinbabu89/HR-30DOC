import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();

		List<String> inputs = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			inputs.add(scanner.next());
		}

		for (Iterator<String> iterator = inputs.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			List<Character> evenPositions = new ArrayList<>();
			List<Character> oddPositions = new ArrayList<>();
			for (int i = 0; i < string.length(); i++) {
				char charAt = string.charAt(i);
				if (i % 2 == 0) {
					evenPositions.add(charAt);
				} else {
					oddPositions.add(charAt);
				}
			}

			for (Iterator<Character> iterator2 = evenPositions.iterator(); iterator2.hasNext();) {
				Character character = (Character) iterator2.next();
				System.out.print(character);
			}
			System.out.print(" ");
			for (Iterator<Character> iterator2 = oddPositions.iterator(); iterator2.hasNext();) {
				Character character = (Character) iterator2.next();
				System.out.print(character);
			}
			System.out.println();

		}
		scanner.close();
	}

}
