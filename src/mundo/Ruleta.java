package mundo;

public class Ruleta {
	
	public Ruleta() {
		System.out.println("Ruleta...");
	}
	
	public int random() {
		return (int)(Math.random() * ((9) + 1));
	}
	
}