
public class MyBook extends Book {
	private int price;
	private String title;
	private String author;

	MyBook(String t, String a) {
		super(t, a);
	}

	public MyBook(String t, String a, int price) {
		super(t, a);
		this.price = price;
		this.title = t;
		this.author = a;
	}

	@Override
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}

}
