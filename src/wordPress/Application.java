package wordPress;

import java.util.Scanner;


public class Application {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int input =-1;
       while(true){
			Menu.printMenu();
			input = scanner.nextInt();

			processInput(input);
		}}

	
	private static void processInput(int input){
		
		
		
		switch(input)
		{
		 case 0:
		  System.out.println("Exiting...");
		  System.exit(0);
		      break;
	
		 case 1:
		     Page page=new Page();
			 PageHelper.addPage(page);
			 		break;
			 		
		 case 2:
			 System.out.println("video post için 1 e, text post için 2 ye basınız");
			  input=scanner.nextInt();
			  PageHelper.addPost(input);
			       break;
			       
		 case 3:
//			 System.out.println("Select a post to comment");
//			 
//			 for(Comment comment ){
				 
			 }
			 
			 
			 
		
		
		
		
		
	}

}
