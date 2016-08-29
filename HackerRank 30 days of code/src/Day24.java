import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day24Node {
	int data;
	Day24Node next;

	Day24Node(int d) {
		data = d;
		next = null;
	}

}

public class Day24 {
	public static Day24Node removeDuplicates(Day24Node head) {
		List<Integer> nodes = new ArrayList<>();
		Day24Node prevNode = null;
		Day24Node start = head;
		while (start != null) {
			if (nodes.contains(start.data)) {
				if (start.next != null) {
					prevNode.next = start.next;
					start = start.next;
				} else {
					if (start.data == prevNode.data) {
						prevNode.next = null;
					}
					start = null;
				}
			} else {
				nodes.add(start.data);
				prevNode = start;
				start = start.next;
			}

		}
		return head;
	}

	public static Day24Node insert(Day24Node head, int data) {
		Day24Node p = new Day24Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Day24Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Day24Node head) {
		Day24Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Day24Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
			System.out.println(T);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
}