package java_class16_exception;

public class MainClass3 {

	public static void main(String[] args) {
		
		MainClass3 mainClass3 = new MainClass3();
		
		try {
			mainClass3.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void firstMethod() throws Exception {
		secondMethod();
	}
	
	public void secondMethod() throws Exception {
		thirdMethod();
	}
	
	public void thirdMethod() throws Exception {
		System.out.println(" 10 나누기 0은 " + (10 / 0));
	}
}
