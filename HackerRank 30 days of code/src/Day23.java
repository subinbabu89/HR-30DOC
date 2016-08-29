import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Day23Node {
	Day23Node left, right;
	int data;

	Day23Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23 {
	static void levelOrder(Day23Node root) {
		Queue<Day23Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Day23Node current = queue.remove();
			System.out.print(current.data + " ");
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
		}

	}

	public static Day23Node insert(Day23Node root, int data) {
		if (root == null) {
			return new Day23Node(data);
		} else {
			Day23Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Day23Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}

}
