
public class Book {
	private int pages;
	private String author;
	private String title;
	private int rating;
	
	public Book(String title, String author, int pages, int rating) {
		this.pages = pages;
		this.author = author;
		this.title = title;
		this.rating = rating;
	}
	
	public String toString() {
		return String.format("Book %s by %s with %d pages has %d stars.", this.title, this.author, this.pages, this.rating);
	}
}
