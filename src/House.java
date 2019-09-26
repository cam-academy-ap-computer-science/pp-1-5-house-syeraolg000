
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the house that Jack built.");
		System.out.println();
		System.out.println("This is the malt");
		House();
		System.out.println();
		System.out.println("This is the rat,");
		malt();
		System.out.println();
		System.out.println("This is the cat,");
		rat();
		System.out.println();
		System.out.println("This is the dog,");
		cat();
		System.out.println();
		System.out.println("This is the cow with the crumpled horn,");
		dog();
		System.out.println();
		System.out.println("This is the maiden all forlorn");
		System.out.println("That milked the cow with the crumpled horn,");
		dog();
	}
	public static void House() {
		System.out.println("That lay in the house that Jack built.");
	} 
	public static void malt() {
		System.out.println("That ate the malt,");
		House();
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


}

