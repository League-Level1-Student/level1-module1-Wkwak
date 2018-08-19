
public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Socks");
		cat.meow();
		cat.printName();
		for (int l = 9; l > 0; l--) {
			cat.kill();
		}
		
		
	}
}
