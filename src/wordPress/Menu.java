package wordPress;

public class Menu {
	public static void printMenu(){
		StringBuilder menu=new StringBuilder();
		
		menu.append("MENU\n");
		menu.append(" \n");
		menu.append("\n");
		menu.append("1)Add page\n");
		menu.append("2)Add post\n");
		menu.append("3)Add comment\n");
		menu.append("4)Show pages\n");
		menu.append("5)Show posts\n");
		System.out.println("seçiminizi yapınız");
		
		System.out.println(menu.toString());
		
	}
	
	
	

}
