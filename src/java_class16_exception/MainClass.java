package java_class16_exception;

public class MainClass {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println("message = " + message);
		}
		
		
		System.out.println("Exception AFTER");
		
	}
	
}
