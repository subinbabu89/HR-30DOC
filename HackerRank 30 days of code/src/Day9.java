import java.util.Scanner;

public class Day9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(getFactorial(input));
        scanner.close();
    }
	
	private static int getFactorial(int n) {
		if(n==1){
			return 1;
		}else{
			return n*getFactorial(n-1);
		}
	}
}
