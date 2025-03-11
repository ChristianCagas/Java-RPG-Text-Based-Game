package MyGame;

import java.util.Scanner;
public class Gamecon extends Experiment {
	static Scanner s = new Scanner(System.in);
	
	//Clear Screen
  public static void Clear() {
	  for(int i = 0; i < 100; i++)
		  System.out.println();
  }
  //print a line
  public static void line(int n) {
	  for(int i = 0; i < n; i++)
		  System.out.print("=");
	  System.out.println();
  }
  //print a text with line
  public static void heading(String title) {
	  line(30);
	  System.out.println(title);
	  line(30);
  }
  //proceed next line
  public static void proceed() {
	  System.out.println("\nPlease [ENTER] to proceed...");
	  s.nextLine();
	  
  }
  
  //game start menu
  public static void GameStartMenu() {
	  System.out.println(backblack+""+purple+"  RPG ADVENTURE TEXT GAME BY  \n         {"+yellow+"ANUBIS KRIV"+creset+""+backblack+""+purple+"}"+""+"        "+creset);
	  Gamecon.heading("      "+red+"Wrath of Notorious"+creset);
	  System.out.println("    "+"1 "+backblack+""+blue+"[PLAY]"+creset+"  |  2 "+backblack+""+red+"[EXIT]"+creset+" ");
	  line(30);
  }
 
}
 
 