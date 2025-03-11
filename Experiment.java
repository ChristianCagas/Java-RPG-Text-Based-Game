package MyGame;


import java.util.Scanner;
public class Experiment extends Gamentity {
	
	static Scanner s = new Scanner(System.in);
	
	//Character category 1
	static String name = "";
	static String role = "";
	public static int check;
	public static int backs;
    static int ask;
	static int level;

	//character skill
	public static String[] RoleSkill = {" ","Slash","Anemostróvilos cuts","Greed in blood","Deep burden flick"};
	public static String[] Aroleskill = {" ","Slash","Anemostróvilos cuts","Deep burden flick"};									
	
	//Skill evolved damage
	
	//first damage 
	public static int[] SkillDmg = {0,25,30,60};
	
	//Second damage evolved
	public static int[] askilldmg = {0,45,60,90};
	
	//third damage evolved
	public static int[] tskilldmg = {0,75,90,120};
	
	//four damage evolved
	public static int[] fskilldmg = {0,85,100,130};
	
	//fifth damage evolved
	public static int[] pskilldmg = {0,95,110,140};
	
	//six damage evolved
	public static int[] sskilldmg = {0,110,120,150};
	
	//final damage evolved
	public static int[] allskill = {0,125,135,165,20};
	
	//Enemy Category
	public static int[] enemyfskill = {0,25,20,70,60,115,130,70,90,120};
	public static int[] enemysskill = {0,0,0,85,75,};
	public static String[] Enemyname = {"","Dummy","Wild pigs","Giant akrida","Abnornal pathikos","Orcs","Wild boar boss","Old Croakio","Glarcor guards 1\r\n"
			+ "Glarcor guards 2","Notorious"};
	//Inventory
	public static String[] Inventory = {" ","Potion","Bread","Apple"};
	
	//Shop Category
	public static String[] Shop = {"","Health Potion","Bread","Dmg Potion"};
	public static int buyshops;
	public static String mystock1 = "";
	public static String mystock2 = "";
	public static String mystock3 = "";
	public static int price;
	static int itemvalue;
	
	
  public static void main(String[] args) {
	  
	  do {
		  
	  Gamecon.GameStartMenu();
	  System.out.print("-> ");
	  menustart = s.nextInt();
	  
	  if(menustart == 1) {
		  
		  Gamecon.Clear();
		   Gamecon.line(25);
		   System.out.println(""+yellow+"Game Start..."+creset);
		   Gamecon.line(25);
		   
		   
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   
		   
		   Gamecon.Clear();
		   System.out.println(""+yellow+"Please wait a moment..."+creset);
		   
		   
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   
		   Gamecon.Clear();
		   System.out.println(""+yellow+"Starting..."+creset);
		  
			   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  
		  Gamecon.Clear();
		  Gamecon.heading(""+backblack+""+red+"WELCOME TO WRATH OF NOTORIOUS"+creset);
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading(""+backblack+""+blue+"CHARACTER INFORMATION (1) "+creset);
		  System.out.print("Enter your name: ");
		  name = s.next();
		  		   
		   Gamecon.Clear();
		   Gamecon.heading("   {"+backblack+""+blue+"CHARACTER INFORMATION"+creset+"}");
		   System.out.println(""+backblack+"Name: "+name+""+"                 "+"\nRole: SwordsMan"+"               ");
		   System.out.println("Health: "+Hp+"/"+maxHp+"               "+creset);
		   Gamecon.line(30);
		   Gamecon.proceed();
		   
		  
		   
		   
		   
		   Gamecon.Clear();
		   GameStory.backstoryone();
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   GameStory.backstorytwo();
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("         "+purple+"{TUTORIAL}"+creset);
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   GameStory.tutorialone();
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   GameStory.tutorialtwo();
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("16 years have pass...");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("My mother has passed away from illness and depression so i have to live all by myself and promised to her \n"
		   +"thay i will gain strength and get revenge for my father. \n"
		   +"While i was training to be the best SwordsMan i could be there's an old man calling me.");
		   Gamecon.proceed();
		   
		   do {
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("Old man(???): Say young man are you okay? You look so pale..?");
		   System.out.println("1. I'm just practicing\n2. No I'm not");
		   System.out.print("-> ");
		   oldman = s.nextInt();
		   
		   if(oldman == 1) {
			   Gamecon.Clear();
			   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
			   System.out.println("old man(???): You must be tired hmm");
			   Gamecon.proceed();
		   }else if(oldman == 2) {
			   Gamecon.Clear();
			   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
			   System.out.println("old man(???): You definitely are lying");
			   Gamecon.proceed();
		   }else {
			   System.out.println("Invalid choice");
		   }
		   }while(oldman >= 3 || oldman <= 0);
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("Oldman(???): Say again young man are you interested in fighting?");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println(""+name+" Yes.");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("old man(???): I see you don't have a good quiet (Sword) \n"
		   +"there i can give this to you in exchange of a favor young man so deal?");
		   System.out.println();
		   System.out.println(""+name+": Deal.");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
           System.out.println("Oldman(???): If you could destroy this training dummy I'll give you a fine reward("+green+"gives quest (0/1 destroyed training dummy"+creset+"))");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println("      "+red+"A DUMMY APPEARED ‼️"+creset);
		   Gamecon.proceed();
		   
		   do {
		   level += 1;
		   Gamecon.Clear();
		   Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
		   System.out.println(""+red+"Training Dummy"+creset+"\nHp: "+dummyhp+"/25");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/"+maxHp);
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   choose1 = s.nextInt();
		   
		   if(choose1 == 1) {
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading(""+cyan+"  You have first skill only"+creset);
			   System.out.println("1."+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
			   System.out.print("-> ");
			   choose3 = s.nextInt();
			   
			   
			   if(choose3 == 1) {
				   
				   Gamecon.Clear();
				   dummyhp -= SkillDmg[1];
				   Gamecon.heading(""+blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(""+blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing dummy's"+creset+" "+SkillDmg[1]+" Damage!!");
				   Gamecon.proceed();
				  
				 
				  if(dummyhp < Hp) {
					  
					  Gamecon.Clear();
					  Gamecon.heading(""+red+"Training Dummy's"+creset+" Hp: "+dummyhp+"/25");
					  Gamecon.proceed();
					  
					  money =+ 100;
					  exp =+ 150;
					  level = 2;
					  Hp = 100;
					  
					  Gamecon.Clear();
					  Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
					  System.out.println("Oldman(???): Thank you very much!\n"
					  + ""+""+green+"Reward"+creset+" = ("+yellow+"Money: "+money+",Exp: "+exp+",A fine (Sword)"+creset+")");
					  System.out.println(yellow+"Plus 20 Damage");
					  System.out.println("Level up +1 !!!"+creset);
					  
					  Gamecon.proceed();
					  
					  do {
					  Gamecon.Clear();
					  Gamecon.heading("        "+yellow+"TRAINING PART 〽️"+creset);
					  System.out.println(""+cyan+"Do you Still wanna continue your journey?"+creset+"");
					  Gamecon.line(30);
					  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
					  System.out.print("-> ");
					  choose4 = s.nextInt();
					  
					  if(choose4 == 1) {		
						  
						  GameStory.pigsstory();
						  
						  Gamecon.Clear();
						  Gamecon.heading("          "+yellow+"FOREST 🏡"+creset);
						  System.out.println("    "+red+"Encountered Wild Pigs ‼️"+creset);
						  Gamecon.proceed();
						  
						 
						   do {
						   Gamecon.Clear();
						   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Wild Pig"+creset);
						   Gamecon.heading("          "+yellow+"FOREST 🏡"+creset);
						   System.out.println(red+"Wild pig"+creset+"\nHp: "+wildpigs+"/75");
						   Gamecon.line(30);
						   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/"+maxHp);
						   Gamecon.line(30);
						   System.out.println("What "+name+" will do? ");
						   Gamecon.line(30);
						   System.out.println("1. Attack\n2. Bag");
						   System.out.print("-> ");
						   choose6 = s.nextInt();
						   													
						   if(choose6 == 1) {
							   
							   do {
								   Gamecon.Clear();
								   Gamecon.heading(""+cyan+"  You have first skill only"+creset);
								   System.out.println("1."+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
								   System.out.print("-> ");
							   choose7 = s.nextInt();
							   
							   if(choose7 == 1) {
								   
								   Gamecon.Clear();
								   wildpigs -= askilldmg[1];
								   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
								   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing wild pig"+creset+" "+askilldmg[1]+" Damage!!!");
								   System.out.println("wild pig Hp: "+wildpigs+"/75");
								   Gamecon.proceed();
								   
								   Gamecon.Clear();
								   Gamecon.heading(red+"Wild pig turn"+creset);
								   Gamecon.proceed();
								   
								   Gamecon.Clear();
								   Hp -= wildpigs;
								   Gamecon.heading(red+"Wild pig use Tackle - Tackle at"+creset+" "+name+" dealing 25 of Damage!!!");
								   Gamecon.proceed();
								   
								   Gamecon.Clear();
								   Gamecon.heading(blue+""+name+""+creset+" turn");
								   Gamecon.proceed();
								   
								  do {
									  
									  Gamecon.Clear();
									  System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Wild Pig"+creset);
									   Gamecon.heading("          "+yellow+"FOREST 🏡"+creset);
									   System.out.println(red+"Wild pig"+creset+"\nHp: "+wildpigs+"/75");
									   Gamecon.line(30);
									   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/"+maxHp);
									   Gamecon.line(30);
									   System.out.println("What "+name+" will do? ");
									   Gamecon.line(30);
									   System.out.println("1. Attack\n2. Bag");
									   System.out.print("-> ");
								   choose10 = s.nextInt();
								   
								   if(choose10 == 1) {
									   
									   do {
										   Gamecon.Clear();
										   Gamecon.heading(""+cyan+"  You have first skill only"+creset);
										   System.out.println("1."+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
										   System.out.print("-> ");
									   choose11 = s.nextInt();
									   if(choose11 == 1) {
										   
										   
										   Gamecon.Clear();
										   wildpigs -= askilldmg[1];
										   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
										   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing wild pig"+creset+" "+askilldmg[1]+" Damage!!!");
										   System.out.println("wild pig Hp: 0/75");
										   Gamecon.proceed();
										   
										     
												   if(wildpigs < Hp) {
													   
													   money += 1000;
													   exp += 300;
													   Hp = 100;
													   bread = 5;
													   level = 4;
													   Gamecon.Clear();
													   Gamecon.heading("   "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
													   GameStory.rewardl(); 
													   
													   System.out.println();
													   System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 1000, Exp: 300, Breads: 5"+creset+")");
													  
													   System.out.println(yellow+"Total of Money: "+money+"\nTotal of Exp: "+exp);
													   System.out.println("Level up +2 !!"+creset);
													   Gamecon.proceed();
													   
													   do {
														   do {
													   GameStory.lishop();
													   check = s.nextInt();
													   
													   if(check == 1) {
														   
														  do {
														      Gamecon.Clear();		  
															  System.out.println("You can buy 1 only!!");
															  Gamecon.heading("-----{ SHOP }-----");
															  System.out.println("1. "+Shop[1]+" price: 1000");
															  System.out.println("2. "+Shop[2]+" price: 500");
															  System.out.println("3. "+Shop[3]+" price: 2500");
															  Gamecon.line(30);
															  System.out.println("Your money: "+money);
															  System.out.println();
															  System.out.println("Description");
															  System.out.println("Health - Gives hero 50% of his health instantly\r\n"
															  		+ "Bread - Gives hero +15 health(can only be used once the effect is done)\r\n"
															  		+ "Dmg potion - increase hero's atck 2x for 1 turn");
															  Gamecon.line(30);
															  System.out.println("Do you wanna buy?\n1. Yes\n2. No (Return) ");
															  System.out.print("-> ");
															  ask = s.nextInt();
															  
															  if(ask == 1) {
																  
																  do {
																  System.out.print("Enter your choice: ");
																  buyshops = s.nextInt();
																  
																  switch(buyshops) {
																  
																  case 1:
																	  healthp += 1;
																	  mystock1 = (healthp+""+Shop[1]);
																	  price = 1000;
																	  itemvalue += healthp;
																	  break;
																	  
																  case 2: 
																	  bread += 1;
																	  mystock1 = (bread+""+Shop[2]);
																	  price = 500;
																	  itemvalue += bread;
																	  break;
																	  
																  case 3:
																	  Dmgp += 1;
																	  mystock1 = (Dmgp+""+Shop[2]);
																	  price = 2500;
																	  itemvalue += Dmgp;
																	  break;
																	  
																	  default:
																		  System.out.println("error.");
																  }
																  
																  }while(buyshops >= 3 || buyshops <= 0);
																  
															  if(money >= price) {
																  	
																	  Gamecon.Clear();
																	  money -= price;
																	  do {
																	  Gamecon.heading("You purchased: "+mystock1+" added to your inventory "+money);
																	  System.out.println("1. return");
																	  System.out.print("-> ");
																	  backs = s.nextInt();
																	  }while(backs >= 2 || backs <= 0);
																	  
																	 
																	  
																	  
																	  }else if(money <= price) {
																		  System.out.println();
																		  System.out.println();
																		  Gamecon.line(20);
																		  System.out.println("Balance insufficient.");
																		  GameStory.lishop();
																		  Gamecon.line(20);
																		  System.out.println();
																		  System.out.println();
																		  
																	  }else {
																		  System.out.println("Invalid choice");
																	  }
															  
															  
															  
															  }else if(ask == 2) {
																  
																 GameStory.lishop();
															  }else {
																  System.out.println("Invalid choice.");
															  }
															 
															  
														  }while(ask >= 3 || ask <= 0);  
													  
													   
														   
													   }else if(check == 2) {
														   
														   do {
															      Gamecon.Clear();
															      Gamecon.heading("   "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
																  System.out.println(""+cyan+"Do you Still wanna continue your journey?"+creset+"");
																  Gamecon.line(30);
																  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
																  System.out.print("-> ");
																  choose14 = s.nextInt();
																  if(choose14 == 1) {
																	  
															GameStory.akridastory();		  
													
			                          
			                          Gamecon.Clear();
			                          Gamecon.heading("            "+yellow+"FARM 🏡"+creset);
									  System.out.println("  "+red+"Encountered Giant Akrída ‼️"+creset);
									  Gamecon.proceed();
									  
									  
									  do {
										  //first
										   Gamecon.Clear();
										   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Giant Akrída"+creset);
										   Gamecon.heading("            "+yellow+"FARM 🏡"+creset);
										   System.out.println(""+red+"Giant Akrída "+creset+"\nHp: "+akHp+"/"+akmaxHp);
										   Gamecon.line(30);
										   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/100");
										   Gamecon.line(30);
										   System.out.println("What "+name+" will do? ");
										   Gamecon.line(30);
										   System.out.println("1. Attack\n2. Bag");
										   System.out.print("-> ");
										   choose16 = s.nextInt();
										   
										   if(choose16 == 1) {
											   
											   do {
												   Gamecon.Clear();
												   Gamecon.heading(cyan+"You have first skill only"+creset);
												   System.out.println("1. "+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
												   System.out.print("-> ");
											   choose17 = s.nextInt();
											   
											   if(choose17 == 1) {
												   
												   Gamecon.Clear();
												   akHp -= askilldmg[1];
												   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
												   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Giant Akrída "+creset+""+askilldmg[1]+"Damage!!");
												   System.out.println("Giant Akrída: "+akHp+"/"+akmaxHp);
												   Gamecon.proceed();
												   
												   Gamecon.Clear();
												   Gamecon.heading(red+"Giant Akrída turn"+creset);
												   Gamecon.proceed();
												   
												   Gamecon.Clear();
												   Hp -= Admg;
												   Gamecon.heading(red+"Giant Akrída use Trow - Trow the "+creset+""+name+" dealing 20 of Damage!!");
												   Gamecon.proceed();
												   
												   Gamecon.Clear();
												   Gamecon.heading(blue+""+name+""+creset+" turn");
												   Gamecon.proceed();
												   
												   
												   
												   //second
												   Gamecon.Clear();
												   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Giant Akrída"+creset);
												   Gamecon.heading("            "+yellow+"FARM 🏡"+creset);
												   System.out.println(""+red+"Giant Akrída "+creset+"\nHp: "+akHp+"/"+akmaxHp);
												   Gamecon.line(30);
												   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/100");
												   Gamecon.line(30);
												   System.out.println("What "+name+" will do? ");
												   Gamecon.line(30);
												   System.out.println("1. Attack\n2. Bag");
												   System.out.print("-> ");
												   choose20 = s.nextInt();
												 
												   if(choose20 == 1) {
													   
													   do {
													   Gamecon.Clear();
													   Gamecon.heading(cyan+"You have first skill only"+creset);
													   System.out.println("1. "+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
													   System.out.print("-> ");
													   choose21 = s.nextInt();
													   
													   if(choose21 == 1) {
														   
														   
														   Gamecon.Clear();
														   akHp -= askilldmg[1];
														   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
														   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Giant Akrída "+creset+""+askilldmg[1]+"Damage!!");
														   System.out.println("Giant Akrída: "+akHp+"/"+akmaxHp);
														   Gamecon.proceed();
														   
														   Gamecon.Clear();
														   Gamecon.heading(red+"Giant Akrída turn"+creset);
														   Gamecon.proceed();
														   
														   Gamecon.Clear();
														   Hp -= Admg;
														   Gamecon.heading(red+"Giant Akrída use Hiss - Hiss at "+creset+""+name+" dealing 0 of Damage!!");
														   Gamecon.proceed();
														   
														   Gamecon.Clear();
														   Gamecon.heading(blue+""+name+""+creset+" turn");
														   Gamecon.proceed();
														   
														   
														   
														   Gamecon.Clear();
														   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Giant Akrída"+creset);
														   Gamecon.heading("    "+yellow+"FARM 🏡"+creset);
														   System.out.println(""+red+"Giant Akrída "+creset+"\nHp: "+akHp+"/"+akmaxHp);
														   Gamecon.line(30);
														   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/100");
														   Gamecon.line(30);
														   System.out.println("What "+name+" will do? ");
														   Gamecon.line(30);
														   System.out.println("1. Attack\n2. Bag");
														   System.out.print("-> ");
														   choose28 = s.nextInt();
														   
														   if(choose28 == 1) {
															   
															   do {
																   Gamecon.Clear();
																   Gamecon.heading(cyan+"You have first skill only"+creset);
																   System.out.println("1. "+RoleSkill[1]+"\n2.Locked Skill\n3.Locked Skill");
																   System.out.print("-> ");
															   choose23 = s.nextInt();
															   
															   if(choose23 == 1) {
																   
																   Gamecon.Clear();
																   akHp -= askilldmg[1];
																   Gamecon.heading("1. "+"You use "+RoleSkill[1]+" !!!");
																   System.out.println(""+name+" use "+RoleSkill[1]+" dealing Giant Akrída "+askilldmg[1]);
																   System.out.println("Giant Akrída: 0/"+akmaxHp);
																   Gamecon.proceed();
														   
																					   
														 if(akHp < Hp || akHp > Hp) {
																				  
																				  
															  money += 500;
														      exp += 250;
														      
															   Hp = 175;
															   level = 5;
														      Gamecon.Clear();
														      Gamecon.heading("   "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
															  GameStory.rewardfarm();
																			   
															   System.out.println();
															   System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 500, Exp: 250, Apple: 3"+creset+")");
															   System.out.println("Total of Money: "+money+"\nTotal of Exp: "+exp);
														       System.out.println(yellow+"Level up +1 !!"+creset);
														       System.out.println("You unlock the second skill!!!");
															   Gamecon.proceed();	
															   
															   
															   do {
															   Gamecon.Clear();
															   Gamecon.Clear();
															   Gamecon.heading("   "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
															   System.out.println(""+cyan+"Do you Still wanna continue your Adventure?"+creset+"");
																  Gamecon.line(30);
																  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
																  System.out.print("-> ");
																  choose29 = s.nextInt();
																  
																  if(choose29 == 1) {
																	  
																	  Gamecon.Clear();
																	  Gamecon.heading("MOVING ROOT FOREST");
																	  Gamecon.proceed();
																	  
																	  Gamecon.Clear();
																	  Gamecon.heading("While "+name+" is traveling");
																	  Gamecon.proceed();
																	  
																	  Gamecon.Clear();
																	  Gamecon.heading("        "+yellow+"IN TRAVEL"+creset);
																	  System.out.println(""+red+"Encountered Abnormal pithikos ‼️"+creset);
																	  Gamecon.proceed();
																	  
																	  
																	 Pithikos.Pitscene();
																	  
																	  														  
																	  
																  }else if(choose29 == 2) {
																	  
																	  do {
																	  Gamecon.Clear();
																	  Gamecon.heading("       {"+backblack+""+blue+"CHARACTER INFO"+creset+"}");
																	  System.out.println(cyan+"Name"+creset+": "+name+"");
																	  System.out.println(cyan+"Hp"+creset+": "+Hp+"/"+maxHp);
																	  Gamecon.line(30);
																	  System.out.println(cyan+"Level"+creset+": "+level);
																	  System.out.println(cyan+"Exp"+creset+": "+exp);
																	  Gamecon.line(30);
																	  System.out.println(cyan+"Role"+creset+": Swordsman");
																	  System.out.println(cyan+"money"+creset+": "+money);
																	  Gamecon.line(30);
																	  System.out.println("1.return");
																	  System.out.print("-> ");
																	  choose30 = s.nextInt();
																	  }while(choose30 >= 2 || choose30 <= 0);
																	  
																  }else if(choose29 == 3) {
																	  System.exit(0);
																  }else {
																	  System.out.println("Invalid choice.");
																  }
																  
															   
															   
															   }while(choose30 == 1 || choose29 >= 4 || choose29 <= 0);
															   
															   
														 }	else if(choose28 == 2) {
															 
															   Gamecon.Clear();
															   Gamecon.heading("INVENTORY");
															   System.out.println("Bread: "+bread);
															   System.out.println();
															   System.out.println("1. RETURN\n2. USE");
															   System.out.print("-> "); 
															   choose22 = s.nextInt();
															   if(choose22 == 2) {
																   
																   
															   }
															   
														   }else {
															   System.out.println("Invalid choice");
														   }	  
													  } else {
														  System.out.println("I cant't use it");
													  }
															   
															   }while(choose23 >= 2);
																		   
																 
														   }		   
																  
														   }else {
														   System.out.println("I cant't use it");
													   }
													   
													   }while(choose21 >= 2);
													   
												   }else if(choose20 == 2) {
													   do {
													   Gamecon.Clear();
													   Gamecon.heading("INVENTORY");
													   System.out.println("Bread: "+bread);
													   System.out.println();
													   System.out.println("1. RETURN\n2. USE");
													   choose23 = s.nextInt();
													   
													   }while(choose23 >= 3 && choose23 <= 0);
													   
													   
													   if(bread >= 0) {
														   
														   System.out.println("You dont' have enough "+Inventory[1]);
														   
													   }else if(choose23 == 2) {
														   Gamecon.Clear();
														   Hp = Hp + 15;
														   System.out.println("You eat the bread +15 Hp");
														   bread = bread - 1;
														   System.out.println("1. return");
														   System.out.print("-> ");
														   choose24 = s.nextInt();
													   }
													   
												   }else {
													   System.out.println("I cant't use it");
													   
												   }
												   
												  
												   
												   
											   }else{
												   System.out.println("I can't use it");
											   }
											   
											   }while(choose17 >= 2);
											   
											   
										   }else if(choose16 == 2) {
											   
											   do {
											   Gamecon.Clear();
											   Gamecon.heading("INVENTORY");
											   System.out.println("Bread: "+bread);
											   System.out.println();
											   System.out.println("1. RETURN\n2. USE");
											   System.out.print("-> ");  
											   choose18 = s.nextInt();
											   
											   }while(choose18 >= 3);
											   
											   if(bread <= 0) {
												   
												   System.out.println("You dont' have enough "+Inventory[1]);
												   
												   
											   }else if(choose18 == 2) {
												   do {
													   
												   bread = bread - 1;
												   Gamecon.Clear();
												   Hp = Hp + 15;
												   System.out.println("You eat the bread +15 Hp");
												   System.out.println("1. return");
												   System.out.print("-> ");
												   choose19 = s.nextInt();
												   
												   }while(choose19 >= 2);
											   }
											   
										  
											   
											   
										   }else {
											   System.out.println("Invalid choice");
										   }
										   
										   
										  }while(choose18 == 1 || choose19 == 1 || choose16 > 3 || choose16 < 0);											
												
														  
															  }else if(choose14 == 2) {
																	  
																  do {
																	  Gamecon.Clear();
																	  Gamecon.heading("       {"+backblack+""+blue+"CHARACTER INFO"+creset+"}");
																	  System.out.println(cyan+"Name"+creset+": "+name+"");
																	  System.out.println(cyan+"Hp"+creset+": "+Hp+"/"+maxHp);
																	  Gamecon.line(30);
																	  System.out.println(cyan+"Level"+creset+": "+level);
																	  System.out.println(cyan+"Exp"+creset+": "+exp);
																	  Gamecon.line(30);
																	  System.out.println(cyan+"Role"+creset+": Swordsman");
																	  System.out.println(cyan+"money"+creset+": "+money);
																	  Gamecon.line(30);
																	  System.out.println("1.return");
																	  System.out.print("-> ");
																	  choose15 = s.nextInt();
																  }while(choose15 >= 2 && choose15 <= 0);
																	  
																  }else if(choose14 == 3){
																	 
																	  System.exit(0);
																	  
																	  
																	  
																  }else {
																	  System.out.println("Invald choice");
																  }
																  
																   }while(choose15 == 1 || choose14 >= 3 || choose14 <= 0);
														   
													   }else if(money <= price){
														   System.out.println("You don't have enough money	");
													   }
													   
													   
													   
														   
														   
														   }while(ask == 2 || money <= price);
													   }while(check >= 3 || check <= 0 || backs == 1);
													 
												   
													   
												   }else {
													   
												   }
												   
								   }else {
										   System.out.println("I cant't use it");
									   }
									   
									   }while(choose11 >= 2);
									   
								   }else if(choose10 == 2) {
									   do {
									   Gamecon.Clear();
									   Gamecon.heading("INVENTORY");
									   System.out.println("empty");
									   System.out.println();
									   System.out.println("1. RETURN");
									   System.out.print("-> ");
									   choose9 = s.nextInt();
									   }while(choose9 >= 2);
								   }else {
									   System.out.println("Invalid choice");
								   }
								  }while(choose9 == 1 || choose10 >= 3 || choose10 <= 0);
								  
								   
							   }else {
								   System.out.println("I cant't use it");
							   }
							   
							   }while(choose7 >= 2);
							   
							   
						   }else if(choose6 == 2) {
							   
							   do {
							   Gamecon.Clear();
							   Gamecon.heading("INVENTORY");
							   System.out.println("empty");
							   System.out.println();
							   System.out.println("1. RETURN");
							   System.out.print("-> ");
							   choose8 = s.nextInt();
							   
							   }while(choose8 >= 2 && choose8 <= 0);
						   }else {
							   System.out.println("Invalid choice");				
							   }
						   
						   
						   }while(choose8 == 1 || choose6 >= 3 || choose6 <= 0 || choose8 >= 2);
					 
					  
					  }else if(choose4 == 2) {
						  do {
						  Gamecon.Clear();
						  Gamecon.heading("       {"+backblack+""+blue+"CHARACTER INFO"+creset+"}");
						  System.out.println(cyan+"Name"+creset+": "+name+"");
						  System.out.println(cyan+"Hp"+creset+": "+Hp+"/"+maxHp);
						  Gamecon.line(30);
						  System.out.println(cyan+"Level"+creset+": "+level);
						  System.out.println(cyan+"Exp"+creset+": "+exp);
						  Gamecon.line(30);
						  System.out.println(cyan+"Role"+creset+": Swordsman");
						  System.out.println(cyan+"money"+creset+": "+money);
						  Gamecon.line(30);
						  System.out.println("1.return");
						  System.out.print("-> ");
						  choose5 = s.nextInt();
						  }while(choose5 >= 2 || choose5 <= 0);
						  
					  }else if(choose4 == 3){
						  
						  
						  System.exit(0);
						  
						  
						  
					  }else {
						  System.out.println("Invalid choice");
					  }
					  }while(choose5 == 1 || choose4 >= 4 || choose4 <= 0 );
					  
				  }else {
					  
				  }
				   
				   
			   }else {
				   System.out.println("I cant't use it.");
			   }
			   
			   }while(choose3 >= 2 || choose3 <= 0);
			   
		   }else if(choose1 == 2) {
			   do {
			   Gamecon.Clear();
			   Gamecon.heading("INVENTORY");
			   System.out.println("empty");
			   System.out.println();
			   System.out.println("1. RETURN");
			   System.out.print("-> ");
			   choose2 = s.nextInt();
			   }while(choose2 >= 2 && choose2 <= 0);
			   
		   }else {
			   System.out.println("Invalid choice.");
		   }
		   }while(choose2 == 1 || choose1 >= 3 || choose1 <= 0);
		  
		  
	  }else if(menustart == 2) {
		  System.exit(0);
	  }else {
		  System.out.println("Invalid choice, please try again. ");
		  Gamecon.Clear();
	  }
	  } while(menustart >= 3 || menustart <= 0);
	  
  }
  
  public static void Akrida() {
	  

  }
  static int mybug;
  static int use;
  public static void Bag() {
	  
	   Gamecon.Clear();
	   Gamecon.heading("INVENTORY");
	   System.out.println("1. "+Inventory[2]+""+bread);
	   System.out.println(mystock1);
	   System.out.println();
	   System.out.println("1. RETURN\n2. USE");
	   System.out.print("-> ");
	   mybug = s.nextInt();
	
	   if(mybug == 2) {

		   Gamecon.Clear();
		   Gamecon.line(30);
		   System.out.println("choose item to use");
		   Gamecon.line(30);
		   System.out.println("1. "+mystock1);
		   System.out.println("0. return");
		   System.out.print("-> ");
		   use = s.nextInt();
	  }else if(bread < 0) {
		   System.out.println("You dont' have enough");
	   }
	 
  }
  
  
  
  
  static int OrcsHp = 220;
  
  public static void con() {
       if(ps >= 0) {
			   
		       Gamecon.Clear();
			   Gamecon.heading("You defeat Abnormal Pithikos");
			   System.out.println("Abnormal Pithikos Hp: 0");
			   Gamecon.proceed();
			   
			   
			   GameStory.milostory();
			   
			   
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading("    "+yellow+"TIMPERIAL's CAMP 🏡"+creset);
			   System.out.println("Commander milo: Ruko! Where have you been are you out sneaking again!? And who's this another rat himself hm!?");
			   System.out.println("1. Rat himself?\n2. I'm just traveling.");
			   System.out.print("-> ");
			   choose33 = s.nextInt();
			   
			 
			   
			   if(choose33 == 1) {
				   
				   Gamecon.Clear();
				   Gamecon.heading("IMPERIAL's CAMP 🏡");
				   System.out.println("commander milo: Yes and? Got a problem with that pitiful stranger?");
				   Gamecon.proceed();
				   
			   }else if(choose33 == 2) {
				   
				   Gamecon.Clear();
				   Gamecon.heading("IMPERIAL's CAMP 🏡");
				   System.out.println("I don't care and no one gave you permission to enter our camp!");
				   Gamecon.proceed();
				   
			   }else {
				   System.out.println("Invalid choice");
			   }
			   
			        }while(choose33 >= 3 || choose33 <= 0);
			   
			   Gamecon.Clear();
			   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			   System.out.println("Riko: oh please commander give us a chance i saw this guy has a lot of potential..!");
			   Gamecon.proceed();
			   
			   Gamecon.Clear();
			   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			   System.out.println("Commander milo:I don't see any potential.\r\n"
			   		+ "He is just a weak traveler. Come back when you can show me a head of an orc BAHAHA!");
			   Gamecon.proceed();
			   
			   Gamecon.Clear();
			   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			   System.out.println(name+" (And when i come back with the head of an orc?)");
			   Gamecon.proceed();
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			   System.out.println("Commander milo:Hmm... I'll give you some goods. It's not like you can do it BAHAHA!!");
			   System.out.println("1. I'll show you\n2. Where can i find an orc?");
			   System.out.print("-> ");
			   choose36 = s.nextInt();
			   
			   if(choose36 == 1) {
				   Gamecon.Clear();
				   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
				   System.out.println("commander milo: HAH! Make me! \r\n"
				   		+ "(Receive map)\r\n"
				   		+ "(Gives quest ("+green+"0/1 head of Orc"+creset+"))");
				   Gamecon.proceed();
				   
				   
			   }else if(choose36 == 2){
				   Gamecon.Clear();
				   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
				   System.out.println("commander milo: Here! Now get lost.\r\n"
				   		+ "(Receive map)\r\n"
				   		+ "(Gives quest (0/1 head of Orc))");
				   Gamecon.proceed();
			   }else {
				   System.out.println("Invalid choice");
			   }
			   }while(choose36 >= 3 || choose36 <= 0);   
			   
			   Gamecon.Clear();
			   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			   System.out.println("Ruko: Goodluck! I know you can do it!");
			   Gamecon.proceed();
			   
			   Gamecon.Clear();
			   Gamecon.heading(cyan+"(Travelling to Orc's cave)"+creset);
			   Gamecon.proceed();
			   
			       Gamecon.Clear();
				  Gamecon.heading(yellow+"      ORC'S CAVE "+creset);
				  System.out.println(red+"Encountered Enemy Orcs ‼️"+creset);
				  Gamecon.proceed();
				  
				  Hp = 175;
				  
				  do {
					  do {
	    
	    
	    Gamecon.Clear();
		    System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Enemy Orcs"+creset);
		   Gamecon.heading("         "+yellow+"ORC'S CAVE"+creset);
		   System.out.println(""+red+"Enemy Orcs "+creset+"\nHp: "+OrcsHp+"/220");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"");
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   
        choose37 = s.nextInt();
        
        if(choose37 == 1) {
        	
        	do {
        	  Gamecon.Clear();
			   Gamecon.heading(cyan+"You have Two skill only"+creset);
			   System.out.println("1. "+RoleSkill[1]+"\n2. "+RoleSkill[2]+"\n3. Locked Skill");
			   System.out.print("-> ");
			   choose40 = s.nextInt();
			   
				   if(choose40 == 1) {
					   Gamecon.Clear();
					   OrcsHp -= tskilldmg[1];
					   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
					   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Enemy Orcs "+creset+""+tskilldmg[1]+" Damage!!");
					   System.out.println("Enemy Orcss Hp: "+EnemyHp[5]);
					   Gamecon.proceed();
					   
					   
					   Gamecon.Clear();
					   Gamecon.heading(red+"Enemy Orcss turn"+creset);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Hp -= enemyfskill[4];
					   Gamecon.heading(red+"Enemy Orcss Scratching the "+creset+""+name+" dealing "+enemyfskill[4]+" of Damage");
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(blue+""+name+""+creset+" turn");
					   Gamecon.proceed();
					   
					   if(OrcsHp <= 0){
						   GameStory.orcreward();
						   }
					   
					  
					   
				   }else if(choose40 == 2) {
					   Gamecon.Clear();
					   OrcsHp -= tskilldmg[2];
					   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
					   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Enemy Orcs "+creset+""+tskilldmg[2]+" Damage!!");
					   System.out.println("Enemy Orcss Hp: "+EnemyHp[5]);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(red+"Enemy Orcss turn"+creset);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Hp -= enemyfskill[4];
					   Gamecon.heading(red+"Enemy Orcss Scratching the "+creset+""+name+" dealing "+enemyfskill[4]+" of Damage");
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(blue+""+name+""+creset+" turn");
					   Gamecon.proceed();	
					   
					   
					   if(OrcsHp <= 0){
						   
						   GameStory.orcreward();
						   	
						   
						   }
					   
					   
					   
				   }else {
					   System.out.println("I can't use it");
				   }
			   
        	}while(choose40 >= 3);
        	
        	
			   
        }else if(choose37 == 2) {
        	
        	do {
        	  Gamecon.Clear();
			   Gamecon.heading("INVENTORY");
			   System.out.println("Bread: "+bread);
			   System.out.println(mystock1);
			   System.out.println("1. RETURN\n2. USE");
			   System.out.print("-> "); 
        	
			   choose38 =s.nextInt();
        	}while(choose38 >= 3);
        	
        	
			   if(itemvalue <= 0) {
				   
				   System.out.println("You dont' have enough "+mystock1);
			
			   }else if(bread >= 0) {
				   
				   do {
				   Gamecon.Clear();
				   Hp = Hp + 15;
				   System.out.println("You eat the "+mystock1+" +15 Hp");
				   itemvalue = itemvalue - 1;
				   System.out.println("1. return");
				   System.out.print("-> ");
				   choose39 = s.nextInt();
				   }while(choose39 >= 2);
				   
			   }
			   
			   }else {
				   System.out.println("Invalid choice.");
			   }
        
				  }while(choose37 >= 3 || choose39 == 1 || choose38 == 1);
				  
				  }while(OrcsHp > 0);  
				  
        	  
        }
			   
    }
  
 
  public static void Shops() {
	  
	  Gamecon.Clear();
	  do {
	  System.out.println("You can buy 1 only!!");
	  Gamecon.heading("-----{ SHOP }-----");
	  System.out.println("1. "+Shop[1]+" price: 1000");
	  System.out.println("2. "+Shop[2]+" price: 500");
	  System.out.println("3. "+Shop[3]+" price: 2500");
	  Gamecon.line(30);
	  System.out.println("Your money: "+money);
	  System.out.println();
	  System.out.println("Description");
	  System.out.println("Health - Gives hero 50% of his health instantly\r\n"
	  		+ "Bread - Gives hero +15 health(can only be used once the effect is done)\r\n"
	  		+ "Dmg potion - increase hero's atck 2x for 1 turn");
	  Gamecon.line(30);
	  System.out.print("-> ");
	  buyshops = s.nextInt();
	  
	  switch(buyshops) {
	  
	  case 1:
		  healthp += 1;
		  mystock1 = (healthp+""+Shop[1]);
		  price = 1000;
		  itemvalue += healthp;
		  break;
		  
	  case 2: 
		  bread += 1;
		  mystock1 = (bread+""+Shop[2]);
		  price = 500;
		  itemvalue += bread;
		  break;
		  
	  case 3:
		  Dmgp += 1;
		  mystock1 = (Dmgp+""+Shop[2]);
		  price = 2500;
		  itemvalue += Dmgp;
		  break;
		  
		  default:
			  System.out.println("error.");
	  }
	  
  if(money >= price) {
	  
		  Gamecon.Clear();
		  money -= price;
		  do {
		  Gamecon.heading("You purchased: "+mystock1+" potion, added to your inventory "+money);
		  System.out.println("1. return");
		  System.out.print("-> ");
		  backs = s.nextInt();
		  }while(backs >= 2 || backs <= 0);
		  
		  }else if(money <= price) {
			  System.out.println();
			  System.out.println();
			  Gamecon.line(20);
			  System.out.println("Balance insufficient.");
			  Gamecon.line(20);
			  System.out.println();
			  System.out.println();
			  
		  }else {
			  System.out.println("Invalid choice");
		  }
  
	  }while(money <= price || backs == 1 || buyshops >= 4 || buyshops <= 0);
	  
  }
  
 
  public static void wildbattle() {
  
  }
  
}