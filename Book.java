import java.time.LocalDate;


public class Book {
	private String bookName;
	private int bookPage;
	private String authorName;
	private LocalDate publishDate;
	
	
	
	
	
	public Book(String bookName, int bookPage, String authorName, LocalDate publishDate) {
		super();
		this.bookName = bookName;
		this.bookPage = bookPage;
		this.authorName = authorName;
		this.publishDate = publishDate;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPage() {
		return bookPage;
	}
	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	

}
