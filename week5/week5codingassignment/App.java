package week5codingassignment;

//Question 9
public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		

//Question 11 Test both methods on both instances, passing in Strings of your choice.
		
		asteriskLogger.log("This is an error!");
		asteriskLogger.log("Try again");
		
		System.out.println();
		
		spacedLogger.log("You will have to space this out.");
		spacedLogger.error("STOP.BIG ERROR");

	}
	

	
}
