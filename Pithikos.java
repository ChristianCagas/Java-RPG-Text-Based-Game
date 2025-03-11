package MyGame;

public class Pithikos extends Experiment {
	static int ps = 210;
	static int Hp = 175;
	
	
	public static void main(String[] agrs) {
		Pitscene();
	}
	
	 public static void Pitscene() {
		 do {
			   Gamecon.Clear();
			    System.out.println("      "+blue+""+name+""+creset+" VS "+red+"Abnormal Pithikos"+creset);
			   Gamecon.heading("            "+yellow+"FARM 🏡"+creset);
			   System.out.println(""+red+"Abnormal Pithikos "+creset+"\nHp: "+ps+"/210");
			   Gamecon.line(30);
			   System.out.println(""+blue+""+name+""+creset+"\nHp: "+Hp+"/175");
			   Gamecon.line(30);
			   System.out.println("What "+name+" will do? ");
			   Gamecon.line(30);
			   System.out.println("1. Attack\n2. Bag");
			   System.out.print("-> ");
			   choose31 = s.nextInt();
			   
			   if(choose31 == 1) {
				   
				   
				   do {
				   Gamecon.Clear();
				   Gamecon.heading(cyan+"You have Two skill only"+creset);
				   System.out.println("1. "+RoleSkill[1]+"\n2. "+RoleSkill[2]+"\n3. Locked Skill");
				   System.out.print("-> ");
				   choose32 = s.nextInt();
				   
				   if(choose32 == 1) {
					   
					   Gamecon.Clear();
					   ps = ps - tskilldmg[1];
					   Gamecon.heading(blue+""+"You use "+RoleSkill[1]+""+creset+" !!!");
					   System.out.println(blue+""+name+" use "+RoleSkill[1]+""+creset+" dealing Giant Akrída "+tskilldmg[1]);
					   System.out.println("Abnormal Pithikos: "+ps);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(red+"Abnormal Pithikos turn"+creset);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Hp -= enemyfskill[3];
					   Gamecon.heading(red+"Abnormal Pithikos use Throw an object at "+creset+""+name+" dealing "+enemyfskill[3]+" of dmg");
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(blue+""+name+""+creset+" turn");
					   Gamecon.proceed();

						   
					  if(ps <= 0) {
						  con();
					  }
		              	
				   }else if(choose32 == 2) {
					   	
					   Gamecon.Clear();
					   ps = ps - tskilldmg[2];
					   Gamecon.heading(blue+""+"You use "+RoleSkill[2]+""+creset+" !!!");
					   System.out.println(blue+""+name+" use "+RoleSkill[2]+""+creset+" dealing Giant Akrída "+tskilldmg[2]);
					   System.out.println("Abnormal Pithikos: "+ps);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(red+"Abnormal Pithikos turn"+creset);
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Hp -= enemyfskill[3];
					   Gamecon.heading(red+"Abnormal Pithikos use Throw an object at "+creset+""+name+" dealing "+enemyfskill[3]+" of dmg");
					   Gamecon.proceed();
					   
					   Gamecon.Clear();
					   Gamecon.heading(blue+""+name+""+creset+" turn");
					   Gamecon.proceed();					   
					   if(ps <= 0) {
							  con();
						  }
					  
			   }else {
					   System.out.println("I can't use it");

				   }
				   
				   
				   
				  
					   }while(choose32 >= 3); 
				   
				   
			   }else if(choose31 == 2) {
				   
				  
				   
				   do {
					  
				   Gamecon.Clear();
				   Gamecon.heading("INVENTORY");
				   System.out.println("1. "+Inventory[2]+" "+bread);
				   System.out.println();
				   System.out.println("1. RETURN\n2. USE");
				   choose34 = s.nextInt();
				   }while(choose34 >= 3);
				   
				  
				  
				   if(bread <= 0) {
					   
					   System.out.println("You dont' have enough "+Inventory[1]);
					   
				   }else if(choose34 == 2) {
					   Gamecon.Clear();
					   Hp = Hp + 15;
					   System.out.println("You eat the bread +15 Hp");
					   bread -= 1;
					   System.out.println("1. return");
					   System.out.print("-> ");
					   choose35 = s.nextInt();
				   }else {
					   System.out.println("");
				   }
				   
				   
			   }else {
				   System.out.println("Invalid choice.");
			   }
			   
			   
			  }while(ps > 0 || choose35 == 1);
			  
			  if(ps == 0 || ps < 0 || 0 >= ps) {
				   con();
			   }else if(ps == 0 || ps <= 0 || 0 >= ps) {
				   con();	
			   }
			  
	 }
	}
