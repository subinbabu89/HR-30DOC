import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Euler1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> inputs = new ArrayList<>();
		Long count = sc.nextLong();
		for (int i = 0; i < count; i++) {
			inputs.add(sc.nextLong());
		}

		for (Iterator iterator = inputs.iterator(); iterator.hasNext();) {
			Long long1 = (Long) iterator.next();
			System.out.println(sumFor3(long1) + sumFor5(long1) - sumFor15(long1));
		}
		sc.close();

	}

	private static Long sumFor3(Long input) {
		long t = 0, n = 1;
		long sum = 0;
		while (t < input) {
			t = (0 + (n - 1) * 3);
			n++;
			if (t < input) {
				sum += t;
			}
		}
		return sum;
	}

	private static Long sumFor5(Long input) {
		long t = 0, n = 1;
		long sum = 0;
		while (t < input) {
			t = (0 + (n - 1) * 5);
			n++;
			if (t < input) {
				sum += t;
			}
		}
		return sum;
	}

	private static Long sumFor15(Long input) {
		long t = 0, n = 1;
		long sum = 0;
		while (t < input) {
			t = (0 + (n - 1) * 15);
			n++;
			if (t < input) {
				sum += t;
			}
		}
		return sum;
	}
	
	private void formula() {
		
	}
}
