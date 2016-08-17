package wordPress;

public abstract class Post extends Page {
	
     private String type;
     
     public Post(String title, String body, String category,String type) {
 		super(title, body, category);
 		this.type=type;
 }
     
     public Post(String title, String body, String category){
    	 super(title, body, category);
     }
     public Post(){
    	 
     }
 
}
