package wordPress;

import java.time.LocalDate;

public class Comment  {
	
	String author;
	String text;
	LocalDate date;
	
	public Comment(String author,String text){
		this.author=author;
		this.text=text;
		this.date=LocalDate.now();
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

}
