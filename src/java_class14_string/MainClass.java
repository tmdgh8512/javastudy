package java_class14_string;

public class MainClass {

	public static void main(String[] args) {
		
		// String str = "java";
		String str = new String("java");
		System.out.println("str : " + str);
		
		str = str + " so easy";
		System.out.println("str : " + str);
		
		//StringBuffer
		StringBuffer sf = new StringBuffer("java");
		System.out.println("sf : " + sf);
		
		sf.append(" world");
		System.out.println("sf : " + sf);
		System.out.println("sf.length : " + sf.length());
		sf.insert(sf.length(), "~~~~~"); // 끝에 문자열에 삽입
		System.out.println("sf : " + sf);
		sf.insert(2, "~~~~~"); // offset을 나타내는 숫자는 몇번째 배열문자부터 삽입할 것인지
		System.out.println("sf : " + sf);
		
		sf.delete(1, 10);
		System.out.println("sf : " + sf);
		
		//StringBuilder
		StringBuilder sd = new StringBuilder("java world");
		sd.append("~~~~~");
		System.out.println("sd : " + sd);
		
	}
	
}
