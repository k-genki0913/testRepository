import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Book)) return false;
		Book r = (Book) o;
		if(!r.title.equals(this.title))return false;
		if(!r.publishDate.equals(this.publishDate)) return false;
		return true;
	}
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPublishDate(Date pb) {
		this.publishDate = pb;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return this.comment;
	}
}
