import java.util.Scanner;

class MyCalculator{

	public int power(int n, int p) throws CustomException {
		if(n<0 || p<0){
			throw new CustomException();
		}else{
			return (int) Math.pow(n, p);
		}
	}
	
}

class CustomException extends Exception {

    @Override
    public String getMessage() {
    	return "n and p should be non-negative";
    }
}

public class Day17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator myCalculator = new MyCalculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
