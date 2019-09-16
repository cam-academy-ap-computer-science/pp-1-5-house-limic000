
public class House {

	public static void main(String[] args) {
		v1();
		n_line();
		v2();
		n_line();
		v3();
		n_line();
		v4();
		n_line();
		v5();
		n_line();
		v6();
	}
	
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
	}
	
	public static void the() {
		System.out.print("This is the ");
	}
	
	public static void malt () {
		System.out.println("That ate the malt");
	}
	
	public static void rat() {
		System.out.println("That killed the rat,");
	}
	
	public static void cat() {
		System.out.println("That worried the cat,");
	}
	
	public static void dog() {
		System.out.println("That tossed the dog,");
	}
	
	public static void cow() {
		System.out.println("That milked the cow with the crumpled horn,");
	}
	
	public static void n_line() {
		System.out.println("");
	}

	public static void v1() {
		the();
		System.out.println("house that Jack built.");
		n_line();
		malt();
		house();
	}
	
	public static void v2() {
		the();
		System.out.println("rat,");
		malt();
		house();
	}
	
	public static void v3() {
		the();
		System.out.println("cat,");
		rat();
		malt();
		house();
	}
	
	public static void v4() {
		the();
		System.out.println("dog,");
		cat();
		rat();
		malt();
		house();
	}
	
	public static void v5() {
		the();
		System.out.println("cow with the crumpled horn,");
		dog();
		cat();
		rat();
		malt();
		house();
	}
	
	public static void v6() {
		the();
		System.out.println("maiden all forlorn");
		cow();
		dog();
		cat();
		rat();
		malt();
		house();
	}
}
