package WOC22;

import java.math.BigInteger;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        System.out.println(m.compareTo(n)==1?0:n.subtract(m));
    }
}
