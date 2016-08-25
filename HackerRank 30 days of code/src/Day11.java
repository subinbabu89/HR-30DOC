import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int allHourglasses[][][] = new int[16][3][3];
		int count = 0;

		/**
		 * Create 3x3 matrices from the input
		 */
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {
				int localHourglass[][] = new int[3][3];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						localHourglass[i][j] = arr[a + i][b + j];
					}
				}
				allHourglasses[count++] = localHourglass;
			}
		}

		/**
		 * Set the hourglass numbers to 0
		 */
		for (int i = 0; i < 16; i++) {
			int[][] js = allHourglasses[i];
			js[1][0] = 0;
			js[1][2] = 0;
		}
		
//		for (int i = 0; i < 16; i++) {
//			int[][] js = allHourglasses[i];
//			int sum = 0;
//			for (int j = 0; j < 3; j++) {
//				for (int k = 0; k < 3; k++) {
//					System.out.print(js[j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		}
		

		/**
		 * Calculate sum of each hourglass
		 */
		int greatestValue = Integer.MIN_VALUE;
		for (int i = 0; i < 16; i++) {
			int[][] js = allHourglasses[i];
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
//					System.out.print(js[j][k]+" ");
					sum += js[j][k];
				}
//				System.out.println();
			}
			
			if (sum > greatestValue) {
				greatestValue = sum;
			}
//			System.out.println(greatestValue);
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		/**
		 * Print result
		 */
		System.out.println(greatestValue);
		in.close();
	}

}
