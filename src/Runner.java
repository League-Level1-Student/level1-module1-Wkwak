
public class Runner {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.setSuperpower("flight");
		p1.setName("superman");
		p2.setSuperpower("strength");
		p2.setName("strongman");
		p3.setName("speedyman");
		p3.setSuperpower("super speed");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
