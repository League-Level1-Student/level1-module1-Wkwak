
public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature c1 = new SeaCreature("spongebob");
		SeaCreature c2 = new SeaCreature("patrick");
		SeaCreature c3 = new SeaCreature("squidward");
		
		c1.eat();
		c1.laugh();
		
		c2.eat();
		c2.laugh();
		System.out.println(c2.getName());
		
		c3.eat();
		c3.laugh();
		System.out.println(c3.getName());
		
	}
}
