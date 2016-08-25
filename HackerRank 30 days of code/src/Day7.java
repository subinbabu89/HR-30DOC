import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Day7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> integers = new Stack<>();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            integers.push(in.nextInt());
        }
        for (Iterator iterator = integers.iterator(); iterator.hasNext();) {
			System.out.print(integers.pop() + " ");
		}
        in.close();
    }
}
