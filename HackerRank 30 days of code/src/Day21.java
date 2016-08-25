
public class Day21 {

	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Day21.class.getDeclaredMethods().length > 2) {
			System.out.println("You should only have 1 method named printArray.");
		}
	}

	private static void printArray(Object currentArray) {
		if (currentArray instanceof Integer[]) {
			Integer[] intarray = (Integer[]) currentArray;
			for (int i = 0; i < intarray.length; i++) {
				System.out.println(String.valueOf(intarray[i]));
			}
		} else {
			String[] strArray = (String[]) currentArray;
			for (int i = 0; i < strArray.length; i++) {
				System.out.println(strArray[i]);
			}

		}
	}
}
