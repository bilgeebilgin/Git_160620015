import java.util.logging.Logger;

public class Loggings {
	private static final Logger logger =  Logger.getLogger(Loggings.class.getName());

	public static void main(String[] args) {
		calis();
	}

	private static void calis() {

		StringBuilder s =new StringBuilder("Hello");
		System.out.println("World    "+s.append("hi")); 	
		
		
		
	}
}
