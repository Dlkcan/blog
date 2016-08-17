package wordPress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PageHelper {
	
private  static	List<Page>pages=new ArrayList<>();
private static List<TextPost>textposts=new ArrayList<>();
private static List<VideoPost>videoposts=new ArrayList<>();
private static List<Post>posts=new ArrayList<>();
   static Scanner src=new Scanner(System.in);
     

	
	public static void addPage(Page page){
		System.out.println("title yi giriniz");
		 String title=src.nextLine();
		System.out.println("body i giriniz");
		 String body=src.nextLine();
		 System.out.println("category i giriniz");
		 String category=src.nextLine();
		 System.out.println("sayfa yaratıldı");
		 
		 page.setTitle(title);
		 page.setBody(body);
		 page.setCategory(category);
	     pages.add(page);
		
	}
	
	
	public static void addPost(int type){
		System.out.println("title yi giriniz");
		 String title=src.nextLine();
		System.out.println("body i giriniz");
		 String body=src.nextLine();
		 System.out.println("category i giriniz");
		 String category=src.nextLine();
		
		if(type==1){
			String url=src.nextLine();
			VideoPost video=new VideoPost(title, body, category, url);
			System.out.println("VideoPost yaratıldı");
			}
		else if(type==2){
			 TextPost text=new TextPost(title, body, category);
			System.out.println("TextPost yaratıldı");
			
		}
		
		}
	
	
}
