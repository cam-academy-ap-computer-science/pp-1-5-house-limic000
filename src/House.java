public class House {

	public static void main(String[] args) {
		v1();
		v2();
		v3();
		v4();
		v5();
		v6();
		v7();
	}
	
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
		n_line();
	}
	
	public static void the() {
		System.out.print("This is the ");
	}
	
	public static void malt () {
		System.out.println("That ate the malt");
		house();
	}
	
	public static void rat() {
		System.out.println("That killed the rat,");
		malt();
	}
	
	public static void cat() {
		System.out.println("That worried the cat,");
		rat();
	}
	
	public static void dog() {
		System.out.println("That tossed the dog,");
		cat();
	}
	
	public static void cow() {
		System.out.println("That milked the cow with the crumpled horn,");
		dog();
	}
	
	public static void n_line() {
		System.out.println("");
	}

	public static void v1() {
		the();
		System.out.println("house that Jack built.");
		n_line();
	}
	
	public static void v2() {
		the();
		System.out.println("malt");
		house();
	}
	public static void v3() {
		the();
		System.out.println("rat,");
		malt();
	}
	
	public static void v4() {
		the();
		System.out.println("cat,");
		rat();
	}
	
	public static void v5() {
		the();
		System.out.println("dog,");
		cat();
	}
	
	public static void v6() {
		the();
		System.out.println("cow with the crumpled horn,");
		dog();
	}
	
	public static void v7() {
		the();
		System.out.println("maiden all forlorn");
		cow();
	}
}