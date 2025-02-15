package task01112024;

public class Book {
private int bid;
private String title;
private String author;
private boolean isAvailable;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}
public Book(int bid, String title, String author, boolean isAvailable) {
	super();
	this.bid = bid;
	this.title = title;
	this.author = author;
	this.isAvailable = isAvailable;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
}

}
