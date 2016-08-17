package wordPress;

import java.time.LocalDate;
import java.util.List;

public class Page {
	
	String title;
	String body;
	LocalDate date;
	String category;
	List comments;
	
	public Page(String title, String body, String category){
		this.title=title;
		this.body=body;
		this.category=category;
		this.date=LocalDate.now();
		
	}
	public Page(){
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDate getDate() {
		return date;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List getComment() {
		return comments;
	}
	public void setComment(List comment) {
		this.comments = comment;
	}

}
