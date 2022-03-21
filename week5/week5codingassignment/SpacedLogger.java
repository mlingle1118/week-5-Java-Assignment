package week5codingassignment;

//Question 3 Create two classes that implement the Logger interface
public class SpacedLogger implements Logger {
	
//Question 7 If the log method received “Hello” as an argument, it should print H e l l o

	@Override
	public void log(String str) {
		
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
	}

//Question 8 The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	@Override
	public void error(String str) {
		System.out.println("Error: ");
		log(str);
		
	}
	
	

}
