package MyGame;

public class GameStory extends Experiment {
	  
	public static void backstoryone() {
		
		Gamecon.heading("        "+cyan+"{back Story I}"+creset);
		System.out.println("I was born in a world where all people we're ruled by a purple humanoid called\n"
				+ "\"Skia latebricola\" or most known as Shadow lurkers.All monsters have gain strength to bring chaos down to us people...");
		Gamecon.line(30);
	}
	
	public static void backstorytwo() {
		
		Gamecon.heading("        "+cyan+"{back Story II}"+creset);
		System.out.println("Back then a war between human and the Skia latebricola has begun and i was just a newborn.\n"
		+"My father is a great man who leads our finest warriors to depend our hometown but one night we got ambush and our wall got destroyed\n"
		+"and shattered to pieces. And my father sacrifice himself to save my mother and i. And this is my journey... ");
		Gamecon.line(30);
	}
	
	public static void tutorialone() {
		
		Gamecon.heading("        "+purple+"{TUTORIAL I}"+creset);
		System.out.println(cyan+"Attack - skill 1,skill2,skill,3,skill4(choose)\n"
				+ "Bag - Where you put your items or be used.\n"
				+ "\n"
				+ "Buy / Sell\n"
				+ "Items name (amount) (Buy/Sell) price:???\n"
				+ "Amount - how many items to sell or buy.\n"
				+ "Buy/Sell - choose categories.\n"
				+ "Price - the price of selled items or the items you gonna buy.\n"
				+ "\n"
				+ "Upgrade\n"
				+ "Input1 > output (payment:???)\n"
				+ "Input2 ^\n"
				+ "\n"
				+ "Input 1 : Weapon\n"
				+ "Input 2 : Materials\n"
				+ "Output = output\n"
				+ ""+creset);
		
	}
	
	public static void tutorialtwo() {
		Gamecon.heading("        "+purple+"{TUTORIAL II}"+creset);
		System.out.println(cyan+"Dmg - The % damage you deal.\n"
				+ "Atck - The strength you gain the more dmg deals.\n"
				+ "Def - The higher defence gain the lower you take damage.\n"
				+ "Health - The life of your hero\n"
				+ "Burn - every damage you deal there's extra % burn damage\n"
				+ "Poison - every damage you deal there's extra % poison damage\n"
				+ "Freeze - Completly stunned for minimum seconds\n"
				+ "Life leech - deals damage and take % of their health\n"
				+ "Stunned - Can't do anything while stunned\n"
				+ "Crit rate - The higher the rate the higher critical chance does damage.\n"
				+ "Critical dmg - A chance of dealing higher damage."+creset);
	}
	
	public static void rewardl() {
		
		System.out.println("Lilith:Woah! It's perfect! Fresh from mother nature! Thank you very much! Half for my brother and half for my shop!\r\n"
				+ "Oh almost forgot here is your reward enjoy!");
		
		
	}
	public static void rewardfarm() {
		
		System.out.println("Farmer nymbo:Thank you, Thank you,Thank you!! I hope this helps you too!");
		
	}
	
	public static void akridastory() {
		
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: You'll ned to upgrade your sword");
		  Gamecon.proceed();
		  
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrading....");
		  
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrade done!!!");
		  System.out.println("{"+green+"Plus 20 Damage"+creset+"} Thank you!!!");
		  Gamecon.proceed();
		  
		
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("Second quest of small ville:");
		  Gamecon.proceed();
		  
Gamecon.Clear();
Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
System.out.println(cyan+"("+name+" if he talk to Farmer nymbo)"+creset);
Gamecon.proceed();
		  
Gamecon.Clear();
Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
System.out.println("Farmer nymbo: Oh hey kid my business is going down because of the pest in my farm.");
Gamecon.proceed();

Gamecon.Clear();
Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
System.out.println(""+name+" (what kind of pest are we talkin?)");
Gamecon.proceed();

Gamecon.Clear();
Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
System.out.println("Farmer nymbo: They are giant akrída they won't stop eating my farm... Wouldn't you mind slaying them off??");
System.out.println();
System.out.println(""+name+" Deal.");
Gamecon.proceed();

Gamecon.Clear();
Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
System.out.println("Farmer nymbo:Thank you very much!!(gives quest (0/1 giant akrída killed))");
Gamecon.proceed();
		
	}
	
	public static void pigsstory() {
		  Gamecon.Clear();
		  Gamecon.heading("      "+yellow+"CLUE OF HOMETOWN 🏠"+creset);
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		print7("("+name+" enter the hometown)\n"
		  		+ "Ah. My hometown where my father lies ahead the floor where my first chaos experience.... What is that?");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("      "+yellow+"CLUE OF HOMETOWN 🏠"+creset);
		  Gamentity.print7("   (Claim an old necklace)");
		  Gamecon.proceed();
		 
		  Gamecon.Clear();
		  Gamecon.heading("........");
		 
		  
		  
		   try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  print7("("+name+" enter the small vile)");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("(???): Oi! You there!");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("(???): You seems to be new here..? Are you?\n"
		  		+ "");
		  System.out.println(name+": Yes.");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("(???) I guess I'm right");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("(???): Anyway I'm lilith this is our hometown!");
		  Gamecon.proceed();
		  
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("Lilith: Hmmm you seems to be a traveler! Oohh ooohh i have a quest for you young traveler! Well my brother is about \n"
		  +"to start his birthday and i need a fresh pig from the forest wouldn't you mind hunting it for me?\n"
		  + "I'll give you a good reward!");
		  System.out.println();
		  System.out.println(""+name+" Deal.");
		  Gamecon.proceed();
		  
		  Gamecon.Clear();
		  Gamecon.heading("    "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		  System.out.println("lilith:Oh my thank you!("+green+"gives quest(0/1 pigs hunted)"+creset+")");
		  Gamecon.proceed();
	}
	
	public static void milostory() {
		Gamecon.Clear();
		 Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println("(???): Excellent job traveler you took down those crazy píthikos!");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println("(???): How did you do it!? You slay them like an ease of a cake! So amazing");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println(""+name+" (May i ask? Who are you?)\r\n"
		   		+ "");
		   Gamecon.proceed();

		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println("(???): Oh yeah yeah almost forgot!\r\n"
		   		+ "");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println("Ruko: My name is Ruko I'm a warrior in training i bet you will surpass me if you join the imperials");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println(""+name+" (Imperials?)");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("            "+yellow+"FOREST 🏡"+creset);
		   System.out.println("Ruko: Yes yes! Where all the brave and strongest warriors at! You seems interested come follow me!\r\n"
		   		+ "");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("(Going to imperial's camp)");
		
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
		   System.out.println("Ruko: This is our leader who lead of this camp\r\n"
		   		+ "");
		   Gamecon.proceed();
	}
	
	static int travel1;
	static int travel2;
	public static void orcreward() {
		
		   money += 1500;
		   exp += 500;
		   level = 6;
		   Hp = 190;
		   Gamecon.Clear();
		   Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
		   System.out.println("Commander milo: Tsk. Here's your stupid reward. Now get lost! Before i arrest you");
		   System.out.println();
		   System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 1500, Exp: 500"+creset+")");
		  
		   System.out.println(green+"Total of Money: "+money+"\nTotal of Exp: "+exp+""+creset);
		   System.out.println(yellow+"Level up +2 !!"+creset);
		   Gamecon.proceed();
		   
		   
		   do {
		       Gamecon.Clear();
		      Gamecon.heading("     "+yellow+"IMPERIAL's CAMP 🏡"+creset);
			  System.out.println(""+cyan+"Do you Still wanna continue your Adventure?"+creset+"");
			  Gamecon.line(30);
			  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
			  System.out.print("-> ");
			  travel1 = s.nextInt();
			  
			  if(travel1 == 1) {
				  Wildboar();
				  
			  }else if(travel1 == 2) {
				  
				  do {
				  Gamecon.Clear();
				  Gamecon.heading("       {"+backblack+""+blue+"CHARACTER INFO"+creset+"}");
				  System.out.println(cyan+"Name"+creset+": "+name+"");
				  System.out.println(cyan+"Hp"+creset+": "+Hp+"/190");
				  Gamecon.line(30);
				  System.out.println(cyan+"Level"+creset+": "+level);
				  System.out.println(cyan+"Exp"+creset+": "+exp);
				  Gamecon.line(30);
				  System.out.println(cyan+"Role"+creset+": Swordsman");
				  System.out.println(cyan+"money"+creset+": "+money);
				  Gamecon.line(30);
				  System.out.println("1.return");
				  System.out.print("-> ");
				  travel2 = s.nextInt();
				  }while(travel2 >= 2);
				  
			  }else if(travel1 == 3) {
				  
				  System.exit(0);
				  
			  }else {
				  
				  System.out.println("Invalid choice.");
			  }
		   
		   }while(travel2 == 1 || travel1 >= 4);
		   
		
		
	}
	public static void lishop() {
		   Gamecon.Clear();
		   Gamecon.heading("   "+yellow+"HOMETOWN SMALL VILLE 🏡"+creset);
		   System.out.println("Lilith: you can also buy and sell in my shop if you needed. Thank you traveler!");
		   System.out.println("do you wanna check lilith shop?\n1. Yes\n2. No");
		   System.out.print("-> ");
		   
	}
	
	 static int boarhp = 225;
	 static int Hp = 190;
	 static int boarfskill = 70;
	 static int boarsskill = 80;
	 static int choice1;
	 static int choice2;
	 static int ret1;
	 static int ret2;
	public static void Wildboar() {
		
		Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: You'll ned to upgrade your sword");
		  Gamecon.proceed();
		  
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrading....");
		  
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrade done!!!");
		  System.out.println("{"+green+"Plus 20 Damage"+creset+"} Thank you!!!");
		  Gamecon.proceed();
		
		   Gamecon.Clear();
		   Gamecon.heading(cyan+"(While "+name+" is traveling)"+creset);
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
		Gamecon.heading("(???):HELP!! HELP! You there! Are you a warrior??? Please... I  beg you please kill that dangerous big boar its destroying our village!");
		Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading(cyan+"    "+name+" (I will.)"+creset);
		Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading("(???): Thank you thank you!!");
		Gamecon.proceed();
		
		   Gamecon.Clear();
		   Gamecon.line(30);
		   System.out.println(""+red+"Encountered Big Wild boar boss ‼️"+creset);
		   Gamecon.line(30);
		   Gamecon.proceed();
		   
		   do {
			   do {
		   Gamecon.Clear();
		   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Old Croakio"+creset);
		   Gamecon.line(30);
		   System.out.println(""+red+"Big Wild boar boss"+creset+"\nHp: "+boarhp+"/225");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/"+maxHp);
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   choice1 = s.nextInt();
		   
		   if(choice1 == 1) {
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading(cyan+"You have Two skill only"+creset);
			   System.out.println("1. "+RoleSkill[1]+"\n2. "+RoleSkill[2]+"\n3. Locked Skill");
			   System.out.print("-> ");
			   choice2 = s.nextInt();
			   }while(choice2 >= 3);
			   if(choice2 == 1) {
				   
				   Gamecon.Clear();
				   boarhp -= fskilldmg[1];
				   Gamecon.heading(blue+""+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Big Wild boar boss "+creset+""+fskilldmg[1]+" Damage!!");
				   System.out.println("Enemy Orcss Hp: "+boarhp);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Big Wild boar boss turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= boarfskill;
				   Gamecon.heading(red+"Big Wild boar boss will dashing forward the"+creset+" "+name+" dealing "+boarfskill+" of Damage");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();	
				   
				   if(boarhp <= 0) {
					   boareward();
				   }
				   
			   }else if(choice2 == 2) {
				   
				   Gamecon.Clear();
				   boarhp -= fskilldmg[2];
				   Gamecon.heading(blue+""+"You use "+RoleSkill[2]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[2]+""+creset+" "+red+"dealing Big Wild boar boss "+creset+""+fskilldmg[2]+" Damage!!");
				   System.out.println("Enemy Orcss Hp: "+boarhp);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Big Wild boar boss turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= boarfskill;
				   Gamecon.heading(red+"Big Wild boar boss will dashing forward the"+creset+" "+name+" dealing "+boarfskill+" of Damage");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();	
				   
				   if(boarhp <= 0) {
					   boareward();
				   }
				   
				   
			   }else {
				   System.out.println("I can't use it");
			   }
			   
			   }else if(choice1 == 2) {
		   
				   do {
			        	  Gamecon.Clear();
						   Gamecon.heading("INVENTORY");
						   System.out.println("Bread: "+bread);
						   System.out.println(mystock1);
						   System.out.println("1. RETURN\n2. USE");
						   System.out.print("-> "); 
			        	
						   ret1 =s.nextInt();
			        	}while(ret1 >= 3);
			        	
			        	
						   if(itemvalue <= 0) {
							   
							   System.out.println("You dont' have enough "+mystock1);
						
						   }else if(itemvalue >= 0) {
							   
							   do {
							   Gamecon.Clear();
							   Hp = Hp + 15;
							   System.out.println("You eat the bread +15 Hp");
							   itemvalue = itemvalue - 1;
							   System.out.println("1. return");
							   System.out.print("-> ");
							   ret2 = s.nextInt();
							   }while(ret2 >= 2);
						   }
						   
						   
				   
		   }else {
			   System.out.println("Invalid choice.");
		   }
		   
			   }while(ret2 == 1 || ret1 == 1);
		   
		   
		   }while(boarhp > 0 || choice1 >= 3);
		
	  }
	
	static int con5;
	static int con6;
	  public static void boareward() {
		  
		   money += 500;
		   exp += 400;
		   level = 7;
		   Hp = 205;
		  
		   Gamecon.Clear();
		   System.out.println("(???): Thank you stranger! Because of you we are all safe now the leader of boar himself is dead!");
		   System.out.println();
		   System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 500, Exp: 400"+creset+")");
		  
		   System.out.println(green+"Total of Money: "+money+"\nTotal of Exp: "+exp+""+creset);
		   System.out.println(yellow+"Level up +1 !!"+creset);
		   Gamecon.proceed();
		  
		   Gamecon.Clear();
		   Gamecon.heading("(???):thank you again! Bye.");
		   Gamecon.proceed();
		   
		   do {
		      Gamecon.Clear();
		      Gamecon.heading("     "+yellow+"INTRAVEL 🏡"+creset);
			  System.out.println(""+cyan+"Do you Still wanna continue your Adventure?"+creset+"");
			  Gamecon.line(30);
			  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
			  System.out.print("-> ");
		      con5 = s.nextInt();
		      
		      if(con5 == 1) {
		    	  Oldc();
		      }else if(con5 == 2) {
		    	  
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
		    	  con6 = s.nextInt();
		    	  }while(con6 >= 2 || con6 <= 0);
		    	  
		      }else if(con5 == 3) {
		    	  
		    	  System.exit(0);
		    	  
		      }
		      
		   }while(con6 == 1 || con5 >= 4);
	  }
			  
	
	public static void Oldc () {
		
		Gamecon.Clear();
	    Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	    Gamecon.proceed();
	    
	    Gamecon.Clear();
	    Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	    System.out.println(cyan+" (While "+name+" is traveling)"+creset);
	    Gamecon.proceed();
	    
	    Gamecon.Clear();
	    Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	    System.out.println("(???):Hey hey!");
	    Gamecon.proceed();
	    
	    Gamecon.Clear();
	    Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	    System.out.println(""+name+" (...?)");
	    Gamecon.proceed();
	    
	  Gamecon.Clear();
	  Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	  System.out.println("Old Croakio:Nice meeting you. me names Croakio and I'm a guardian of this ruins\r\n"
	  		+ "And you just dare to set foot on a sacred places..!!");
	  Gamecon.proceed();
		
	  OldcBattle();
		
	}
	
	static int croahp = 300;
	public static int[] croadmg = {90,100,135};
	static int fight1;
	static int fight2;
	static int fight3;
	public static void OldcBattle() {
		
		Hp = 205;
		
		
		   Gamecon.Clear();
		   Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
		   System.out.println("    "+red+"Old Croakio battle ‼️"+creset);
		   Gamecon.proceed();
		
		   do {
		   Gamecon.Clear();
		   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Old Croakio"+creset);
		   Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
		   System.out.println(""+red+"Old Croakio"+creset+"\nHp: "+croahp+"/300");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/205");
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   fight1 = s.nextInt();
		   
		   if(fight1 == 1) {
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading(""+cyan+"  You have second skill only"+creset);
			   System.out.println("1. "+RoleSkill[1]+"\n2. "+RoleSkill[2]+"\n3. Locked Skill");
			   System.out.print("-> ");
			   fight2 = s.nextInt();
			   
			   if(fight2 == 1) {
				   
				   Gamecon.Clear();
				   croahp -= pskilldmg[1];
				   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Old Croakio"+creset+" "+pskilldmg[1]+" Damage!!!");
				   System.out.println("Old Croakio Hp: "+croahp+"/300");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Old Croakio turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= croadmg[1];
				   Gamecon.heading(red+"Old Croakio use Crashful jump - Jumping really high and kicking the"+creset+" "+name+" dealing 90 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
				   if(croahp <= 0) {
					   croareward();  
				   }
				   
				   
			   }else if(fight2 == 2) {
				   
				   Gamecon.Clear();
				   croahp -= pskilldmg[2];
				   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Old Croakio"+creset+" "+pskilldmg[2]+" Damage!!!");
				   System.out.println("Old Croakio Hp: "+croahp+"/300");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Old Croakio turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= croadmg[1];
				   Gamecon.heading(red+"Old Croakio use Crashful jump - Jumping really high and kicking the"+creset+" "+name+" dealing 90 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
                   if(croahp <= 0) {
                	   croareward();
                   }
				   
			   }else {
				   System.out.println("I can't use it. ");
			   }
			   
			   }while(fight2 >= 3 || fight2 <= 0);
			   
		   }else if(fight1 == 2) {
			   
			   Experiment.Bag();
			 //BAG || INVENTORY
			   
		   }else {
			   System.out.println("Invalid choice.");
		   }
		   
		}while(croahp > 0 || fight1 >= 3 || fight1 <= 0);
		   
		   
		   
	}
	
	static int con;
	static int con1;
	public static void croareward() {
		
		    money += 500;
		   exp += 700;
		   level = 8;
		   Hp = 220;
		   
	       Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:You prove me wrong. I guess you are very welcome well here.");
		   System.out.println();
		   System.out.println(green+"Reward"+creset+" = ("+yellow+"Exp: 700"+creset+")");
		  
		   System.out.println(green+"Total of Exp: "+exp+""+creset);
		   System.out.println(yellow+"Level up +1 !!"+creset);
		   Gamecon.proceed();
		   
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:I smell your sadness here kid, and it is very big aura.. Have you got a past?\r\n"
	       		+ "");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(""+name+" (My mother... My hometown... Especially my... Father.)");
		   Gamecon.proceed();
		   
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:What happen to them?");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(""+name+" (Skia latebricola.)");
		   Gamecon.proceed();
		   
		    Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:I see.");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(name+" (Do you know who's necklace is this?,i found it in our old hometown...)");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:....");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:This.. ");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio:I know who's owner of this necklace!! He was furious and one of the commander of the skias...!");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: I'll answer your quick thought.\r\n"
	       		+ "I know him since 18 years ago. I was force to make them a magical bomb i called it the \r\n"
	       		+ "\"Croaking implosion\" it was made from fresh creeping toads... His name was Noctorious");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(name+" (Noctorious...)");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: Yes he is very greed conquering places here someone should stop him and \n"
	       +"especially their king... I see a good potential in your heart. It burns rapidly!");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(name+" (How am i supposed to defeat him!?)");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: you will move the strength on him i know you can.");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(name+" (Thank you. Oldman.)");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: i will give you my blessings!");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: Be blessed! By our master toads and past future himself!!");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: Now you must gain strength to be strong. Destroy every monster who'll stand in your way. Make us all people proud.\r\n"
	       		+ "Bring us back our freedom... Traveler");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println("Old Croakio: Here is the map where you can find their campsite.");
		   Gamecon.proceed();
		   
		   Gamecon.Clear();
	       Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
	       System.out.println(name+" (Thank you.)");
		   Gamecon.proceed();
		   
		   do {
		      Gamecon.Clear();
		      Gamecon.heading("    "+yellow+"THE RUINS OF CROATIA"+creset);
			  System.out.println(""+cyan+"Do you Still wanna continue your adventure?"+creset+"");
			  Gamecon.line(30);
			  System.out.println("1. Continue\n2. Character info\n3. Exit Game");
			  System.out.print("-> ");
		     con = s.nextInt();
		     
		     if(con == 1) {
		    	 
		    	 glakor();
		 
		     }else if(con == 2) {
		    	 
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
				  con1 = s.nextInt();
		    	 }while(con1 >= 2 || con1 <= 0);
				  
		     }else if(con == 3) {
		    	 
		    	 System.exit(0);
		    	 
		     }else {
		    	 System.out.println("Invalid choice.");
		     }
		     
		   }while(con >= 4 || con <= 0 || con1 == 1);
	}
	
	static int ask4;
	static int ask5;
	public static void glakor() {
		
		 Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: You'll ned to upgrade your sword");
		  Gamecon.proceed();
		  
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrading....");
		  
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		  
		  Gamecon.Clear();
		  Gamecon.heading("      {"+blue+"SWORD UPGRADER"+creset+"}");
		  System.out.println("["+backblack+""+red+"Sword Expert"+creset+"] Slyph: Upgrade done!!!");
		  System.out.println("{"+green+"Plus 20 Damage"+creset+"} Thank you!!!");
		  Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading(cyan+"(While "+name+" is walking)"+creset);
		Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading("(???): HAHAHA Pitiful humans! Do not give mercy on them! And let them suffer!");
		Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		Gamecon.proceed();
		
		do {
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("What "+name+" Will do? \n1. Wait\n2. Attack");
		System.out.print("-> ");
		ask4 = s.nextInt();
		}while(ask4 >= 3 || ask4 <= 0);
		
		if(ask4 == 1) {
			
			Gamecon.Clear();
			Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
			System.out.println("(???): HEY YOU! You idiot don't give them mercy. I said tortured them!");
			Gamecon.proceed();
			
			do {
				
			Gamecon.Clear();
			Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
			System.out.println("What "+name+" Will do? \n1. Wait\n2. Attack");
			System.out.print("-> ");
			ask5 = s.nextInt();
			}while(ask5 >= 3 || ask5 <= 0);
			
			if(ask5 == 1) {
				
				Gamecon.Clear();
				Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
				System.out.println("(???): Let everybody knows i am close to fulfill our master's wish! BAHAHAHA!!\r\n"
						+ "HUH??? Who's there guards check it and kill it immediately!");
				Gamecon.proceed();
				
				glakorb();
				
			}else if(ask5 == 2) {
				
				Gamecon.Clear();
				Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
				System.out.println("(???): Who are you!? Guards kill this puny human Who's tryna be a hero.");
				Gamecon.proceed();
				
	           glakorb();
				
			}else {
				System.out.println("Invalid choice.");
			}
			
			
			
		}else if(ask4 == 2) {
			glakorb();
		}
		
		
		
	}
	
	static int glakorhp = 250;
	static int battle5;
	static int chooseskill;
	static int glakordmg = 100;
	static int ret3;
	static int ret4;
	public static void glakorb() {
		
		
		   Gamecon.Clear();
		   Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		   System.out.println("    "+red+"Glarkor Guards ‼️"+creset);
		   Gamecon.proceed();
		
		   do {
			   do {
		   Gamecon.Clear();
		   System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Glarkor Guard"+creset);
		   Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		   System.out.println(""+red+"Glarkor Guard "+creset+"\nHp: "+glakorhp+"/250");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/220");
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   battle5 = s.nextInt();
		   
		   if(battle5 == 1) {
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading(""+cyan+"  You have second skill only"+creset);
			   System.out.println("1. "+RoleSkill[1]+"\n2. "+RoleSkill[2]+"\n3. Locked Skill");
			   System.out.print("-> ");
			   chooseskill = s.nextInt();
			   
			   if(chooseskill == 1) {
				   
				   Gamecon.Clear();
				    glakorhp -= sskilldmg[1];
				   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Glarkor Guard "+creset+" "+sskilldmg[1]+" Damage!!!");
				   System.out.println("Glarkor Guard Hp: "+glakorhp+"/250");
				   Gamecon.proceed();
				   
				   if(glakorhp <= 0) {
					   
					   glarkoreward();
					   
				   }else if(Hp <= 0) {
					   
				   }
				   
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Glarkor Guard turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= glakordmg;
				   Gamecon.heading(red+"Glarkor Guard use Slash - Slashing the"+creset+" "+name+" dealing 100 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
				   
				   
			   }else if(chooseskill == 2) {
				   
				   Gamecon.Clear();
				    glakorhp -= sskilldmg[2];
				   Gamecon.heading(blue+"You use "+RoleSkill[2]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[2]+""+creset+" "+red+"dealing Glarkor Guard "+creset+" "+sskilldmg[2]+" Damage!!!");
				   System.out.println("Glarkor Guard Hp: "+glakorhp+"/250");
				   Gamecon.proceed();
				   
                  if(glakorhp <= 0) {
					   
					   glarkoreward();
				   }else if(Hp <= 0) {
					   
					   
					   
				   }
				   
				   Gamecon.Clear();
				   Gamecon.heading(red+"Glarkor Guard turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= glakordmg;
				   Gamecon.heading(red+"Glarkor Guard use Slash - Slashing the"+creset+" "+name+" dealing 100 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
				   
			   }else {
				   System.out.println("I can't use it.");
			   }
			   
			   }while(chooseskill >= 3 || chooseskill <= 0);
			   
		   }else if(battle5 == 2) {
			   
			   
			   do {
		        	  Gamecon.Clear();
					   Gamecon.heading("INVENTORY");
					   System.out.println("Bread: "+bread);
					   System.out.println(mystock1);
					   System.out.println("1. RETURN\n2. USE");
					   System.out.print("-> "); 
		        	
					  ret3 =s.nextInt();
		        	}while(ret3 >= 3);
		        	
		        	
					   if(itemvalue <= 0) {
						   
						   System.out.println("You dont' have enough "+mystock1);
					
					   }else if(itemvalue >= 0) {
						   
						   do {
						   Gamecon.Clear();
						   Hp = Hp + 15;
						   System.out.println("You eat the bread +15 Hp");
						   itemvalue = itemvalue - 1;
						   System.out.println("1. return");
						   System.out.print("-> ");
						   ret4 = s.nextInt();
						   }while(ret4 >= 2);
					   }
					   
					   
			   
		   }else {
			   System.out.println("Invalid choice. ");
		   }
		   
			   }while(ret3 == 1 || ret4 == 1);
		   
		   }while(glakorhp > 0 || battle5 >= 3);
		
		
	}
	
	public static void glarkoreward() {
		
		Hp = 235;
		exp += 400;
		money += 300;
		level = 10;
		 Gamecon.Clear();
		 Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		 System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 200, Exp: 400"+creset+") ");
		 System.out.println("Total of Exp: "+exp);
		 System.out.println(yellow+"Level up +2 !!");
		 System.out.println("You unlock the all skill!!!"+creset);
		 Gamecon.proceed();
		 
		 
		 
		 Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("(???): Hmm i see you defeated my guards but that's not gonna make me \n"+
		"fear you weakling. Hmmm i remember you somewhere..?\r\n"
				+ "");
	   Gamecon.proceed();
	   
	   Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println(name+" (I know you Noctorious.)");
		Gamecon.proceed();
		 
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("Noctorious: Very well you know my name i also know yours. You're the lumpy newborn of that \n"+
		"pathehic father of yours heh! You're lucky you survive that night.");
		Gamecon.proceed();
		
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println(name+" (How did you know my father..)");
		Gamecon.proceed();
		 
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("Noctorious: Simple. Kid. I slash it with my bare hands i have hold your father's head now I don't have time talking to you I");
		Gamecon.proceed();
		 
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("Notorious: Simple. Kid. I slash it with my bare hands i have hold your father's head now i don't have time \n"+
		"talking to you I'll take your head TOO!");
		Gamecon.proceed();
		
		finalboss();
	}
	
	static int notorhp = 365;
	static int finl;
	static int askill;
	static int ret5;
	static int ret6;
	public static void finalboss() {
		
		
		   Gamecon.Clear();
		   Gamecon.heading("      "+yellow+"FINAL BOSS"+creset);
		   System.out.println(""+purple+"Battle Commander Notorious boss ‼️"+creset);
		   Gamecon.proceed();
		   
		   do {
			   do {
		   Gamecon.Clear();
		   System.out.println("  "+blue+""+name+""+creset+" VS "+purple+"Commander Notorious"+creset);
		   Gamecon.heading("      "+yellow+"FINAL BOSS"+creset);
		   System.out.println(""+purple+"Commander Notorious "+creset+"\nHp: "+notorhp+"/365");
		   Gamecon.line(30);
		   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/220");
		   Gamecon.line(30);
		   System.out.println("What "+name+" will do? ");
		   Gamecon.line(30);
		   System.out.println("1. Attack\n2. Bag");
		   System.out.print("-> ");
		   finl = s.nextInt();
		   
		   if(finl == 1) {
			   
			   do {
			   Gamecon.Clear();
			   Gamecon.heading(""+cyan+"   You have fourth skill "+creset);
			   System.out.println("1. "+RoleSkill[1]+" Damage: "+allskill[1]+"\n2. "+RoleSkill[2]+" Damage: "+allskill[2]+"\n3. "+RoleSkill[3]+" Heal: 20% "+"\n4. "+RoleSkill[4]+" Damage: "+allskill[3]);
			   System.out.print("-> ");
			   askill = s.nextInt();
			   
			   if(askill == 1) {
				   
				   Gamecon.Clear();
				   notorhp -= allskill[1];
				   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" "+red+"dealing Commander Notorious "+creset+" "+allskill[1]+" Damage!!!");
				   System.out.println("Commander Notorious Hp: "+notorhp+"/365");
				   Gamecon.proceed();
				   
                     if(notorhp <= 0) {
                    	 finalld();
                     }else if(Hp <= 0) {
                    	 notordef();
                     }
				   
				   Gamecon.Clear();
				   Gamecon.heading(purple+"Commander Notorious turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= notorhp;
				   Gamecon.heading(purple+"Commander Notorious use Enormous swing - swinging his sword to "+creset+" "+name+" dealing 100 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
				   
				   
				   
			   }else if(askill == 2) {
				   
				   Gamecon.Clear();
				   notorhp -= allskill[2];
				   Gamecon.heading(blue+"You use "+RoleSkill[1]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[2]+""+creset+" "+red+"dealing Commander Notorious "+creset+" "+allskill[2]+" Damage!!!");
				   System.out.println("Commander Notorious Hp: "+notorhp+"/365");
				   Gamecon.proceed();
				   
				   if(notorhp <= 0) {
                  	 finalld();
                   }else if(Hp <= 0) {
                	   notordef();
                   }
				   
				   Gamecon.Clear();
				   Gamecon.heading(purple+"Commander Notorious turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= notorhp;
				   Gamecon.heading(purple+"Commander Notorious use Enormous swing - swinging his sword to "+creset+" "+name+" dealing 100 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
				   
			   }else if(askill == 3) {
				   
				   
				   Gamecon.Clear();
				   Hp += allskill[4];
				   Gamecon.heading(blue+"You use "+RoleSkill[3]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[3]+""+creset+" to Heal plus 20%");
				   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/220");
				   Gamecon.proceed();
				   
				   if(notorhp <= 0) {
                  	 finalld();
                   }else if(Hp <= 0) {
                	   notordef();
                   }
				   
				 
			   }else if(askill == 4) {
				   
				   
				   Gamecon.Clear();
				   notorhp -= allskill[3];
				   Gamecon.heading(blue+"You use "+RoleSkill[4]+""+creset+" !!!");
				   System.out.println(blue+""+name+" use "+RoleSkill[4]+""+creset+" "+red+"dealing Commander Notorious "+creset+" "+allskill[3]+" Damage!!!");
				   System.out.println("Commander Notorious Hp: "+notorhp+"/365");
				   Gamecon.proceed();
				   
				   if(notorhp <= 0) {
                  	 finalld();
                   }else if(Hp <= 0) {
                	   notordef();
                   }
				   
				   Gamecon.Clear();
				   Gamecon.heading(purple+"Commander Notorious turn"+creset);
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Hp -= notorhp;
				   Gamecon.heading(purple+"Commander Notorious use Enormous swing - swinging his sword to "+creset+" "+name+" dealing 100 of Damage!!!");
				   Gamecon.proceed();
				   
				   Gamecon.Clear();
				   Gamecon.heading(blue+""+name+""+creset+" turn");
				   Gamecon.proceed();
				   
			   }else {
				   System.out.println("Invalid choice.");
			   }
			   
			   }while(askill >= 5 || askill <= 0);
			   
			   
		   }else if(finl == 2) {
			   
			   do {
		        	  Gamecon.Clear();
					   Gamecon.heading("INVENTORY");
					   System.out.println("Bread: "+bread);
					   System.out.println(mystock1);
					   System.out.println("1. RETURN\n2. USE");
					   System.out.print("-> "); 
		        	
					   ret5 =s.nextInt();
		        	}while(ret5 >= 3);
		        	
		        	
					   if(itemvalue <= 0) {
						   
						   System.out.println("You dont' have enough "+mystock1);
					
					   }else if(bread >= 0) {
						   
						   do {
						   Gamecon.Clear();
						   Hp = Hp + 15;
						   System.out.println("You eat the "+" +15 Hp");
						   itemvalue = itemvalue - 1;
						   System.out.println("1. return");
						   System.out.print("-> ");
						   ret6 = s.nextInt();
						   }while(ret6 >= 2);
					   }
			   
		   }else {
			   System.out.println("Invalid choice.");
		   }
		   
			   }while(ret5 == 1 || ret6 == 1);
		   
		   }while(notorhp >= 0 || finl >= 3 || finl <= 0);
	}
	
	public static void finalld() {
		
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("Noctorious:HAHAHA... It is not over humans... I will be back one d-day!! And destroy you all..!!!\r\n"
				+ "");
		Gamecon.proceed();
		
		
		 Gamecon.Clear();
		 Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		 System.out.println(green+"Reward"+creset+" = ("+yellow+"Money: 3000, Exp: 1000, Legendary Sealed purple orb"+creset+") ");
		 Gamecon.proceed();
		 
		 Gamecon.Clear();
			Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
			System.out.println("This is the end of your journey "+name+" farewell.");
			Gamecon.proceed();
			
			 
			
			Gamecon.Clear();
			Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
			System.out.println(""+name+"'s pov: I wonder what is his real deal in this world and I've never seen a latebricola before until now.. \n"
			+"what is their connection I can't wait to start a new journey...");
			
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			 Gamecon.Clear();
			 System.out.println(backblack+""+yellow+"Wrath of Notorious - ANUBIS KRIV"+creset);
			
			 
			System.exit(0);
		
			
	}
	
	public static void notordef() {
		
		
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println(" Noctorious:What a childish game to pretend like a \n"
		+"hero little warrior you're nothing but a pile of trash in the ground now be gone (Died)");
		Gamecon.proceed();
		
		
		Gamecon.Clear();
		Gamecon.heading("     "+yellow+"THE GLARKOR CAMP"+creset);
		System.out.println("Be reborn hero it's not the end yet....");
		Gamecon.proceed();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Gamecon.Clear();
		 System.out.println(backblack+""+yellow+"Wrath of Notorious - ANUBIS KRIV"+creset);
		 
		 System.exit(0);
		
	}
			

}