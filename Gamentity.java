package MyGame;

public class Gamentity {
	
	//Character category 2
	static int Hp = 100;
	static int maxHp = 100;
	
	//entity category
	static int emaxHp = 100;
	static int dummyhp = 25;
	static int wildpigs = 75;
	static int Admg = 20;
	static int akHp = 110;
	static int wildpigdmg = 25;
	static int dmaxHp = 25;
	static int akmaxHp = 110;
	static int ps = 210;
	static String skill;
	static int fskilldmg;
	static String fskill;
	static int money;
	static int exp;
	static int totalmoney;
	static int totalexp;
	public static int bread;
	public static int healthp;
	public static int Dmgp;
	
	//Scanner user input
	static int menustart;
	static int charole;
	static int oldman;
	static int choose1;
	static int choose2;
	static int choose3;
	static int choose4;
	static int choose5;
	static int choose6;
	static int choose7;
	static int choose8;
	static int choose9;
	static int choose10;
	static int choose11;
	static int choose12;
	static int choose13;
	static int choose14;
	static int choose15;
	static int choose16;
	static int choose17;
	static int choose18;
	static int choose19;
	static int choose20;
	static int choose21;
	static int choose22;
	static int choose23;
	static int choose24;
	static int choose25;
	static int choose26;
	static int choose27;
	static int choose28;
	static int choose29;
	static int choose30;
	static int choose31;
	static int choose32;
	static int choose33;
	static int choose34;
	static int choose35;
	static int choose36;
	static int choose37;
	static int choose38;
    static int choose39;
    static int choose40;
    
    //Text color
    static String creset = "\u001B[0m";
    static String black = "\u001B[30m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String cyan = "\u001B[36m";
    static String white = "\u001B[37m";
    
    //back color
    static String backblack = "\u001B[40m";
    static String backred = "\u001B[41m";
    static String backgreen = "\u001B[42m";
    static String backyellow = "\u001B[43m";
    static String backblue = "\u001B[44m";
    static String backpurple = "\u001B[45m";
    static String backcyan = "\u001B[46m";
    static String backwhite = "\u001B[47m";
    
    //enemy category
	public static int[] EnemyHp = {0,25,75,110,210,220,250,275,225,300,365} ;
	
	public static void text(String text) {
		System.out.println(text);
	}
	public static void print1(String text) {
		System.out.println(black+text+creset);
	}
	public static void print2(String text) {
		System.out.println(red+text+creset);
	}
	public static void print3(String text) {
		System.out.println(green+text+creset);
	}
	public static void print4(String text) {
		System.out.println(yellow+text+creset);
	}
	public static void print5(String text) {
		System.out.println(blue+text+creset);
	}
	public static void print6(String text) {
		System.out.println(purple+text+creset);
	}
	public static void print7(String text) {
		System.out.println(cyan+text+creset);
	}

}
