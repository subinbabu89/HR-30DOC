import java.util.Scanner;

public class Day20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		performBubbleSort(a);
		in.close();
	}

	private static void performBubbleSort(int[] a) {
		int n = a.length;
		int totalSwaps = 0;
		for (int i = n - 1; i > 0; i--) {
			int numberOfSwaps = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numberOfSwaps++;
					totalSwaps++;
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + totalSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

}
