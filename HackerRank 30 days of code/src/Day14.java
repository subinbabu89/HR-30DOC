import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		elements = a;
		maximumDifference = 0;
	}

	public void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (i != j) {
					int temp = Math.abs(elements[i] - elements[j]);
					if (temp > maximumDifference) {
						maximumDifference = temp;
					}
				}
			}
		}
	}
} // End of Difference class

public class Day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}