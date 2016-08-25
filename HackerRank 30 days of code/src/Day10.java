import java.math.BigInteger;
import java.util.Scanner;

public class Day10 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        BigInteger n = in.nextBigInteger();
	        String binaryString = n.toString(2);
	        int globalCount = 0;
	        int localCount= 0;
	        for (int i = 0; i < binaryString.length(); i++) {
				Character string = binaryString.charAt(i);
				if(string=='1'){
					localCount++;
				}else{
					if(localCount>globalCount){
						globalCount = localCount;
					}
					localCount=0;
				}
//				System.out.println("localCount "+ localCount);
//				System.out.println("globalCount" + globalCount);
//				System.out.println("current char" + string);
//				System.out.println("------------------------------");
			}
	        if(localCount!=0){
	        	if(globalCount<localCount){
	        		globalCount = localCount;
	        	}
	        }
	        System.out.println(globalCount);
	        in.close();
	    }
}
