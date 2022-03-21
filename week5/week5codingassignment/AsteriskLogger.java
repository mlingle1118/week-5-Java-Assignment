package week5codingassignment;

//Question 3 Create two classes that implement the Logger interface
public class AsteriskLogger implements Logger {



//Question 4

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
		
	}
	
//Question 5
	@Override
	public void error(String str) {
		
		String error = "Error: " + str;
		int length = error.length() + 3;
		StringBuilder line = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			line.append('*');
		}
		
		System.out.println(line.toString());
		log(error);
		System.out.println(line.toString());
	}
}