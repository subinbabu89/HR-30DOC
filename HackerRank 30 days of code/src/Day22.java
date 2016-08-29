import java.util.Scanner;

class Day22Node {
	Day22Node left, right;
	int data;

	Day22Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22 {
	public static int getHeight(Day22Node root) {
		int heightLeft = 0;
		int heightRight = 0;

		if (root.left != null) {
			heightLeft = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			heightRight = getHeight(root.right) + 1;
		}

		return (heightLeft > heightRight ? heightLeft : heightRight);
	}

	public static Day22Node insert(Day22Node root, int data) {
		if (root == null) {
			return new Day22Node(data);
		} else {
			Day22Node cur;
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
		Day22Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}

}
