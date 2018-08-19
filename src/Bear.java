
public class Bear {

	int hibernationTime;
	String food;
	
	Bear(String food, int hibernationTime) {
		this.food = food;
		this.hibernationTime = hibernationTime;
	}
	
	void hunt() {
		System.out.println("hunting prey");
	}
	
	void sleep() {
		System.out.println("Bear is sleeping");
	}
}
