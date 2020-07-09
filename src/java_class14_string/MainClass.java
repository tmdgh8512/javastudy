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
		sf.insert(sf.length(), "~~~~~"); // ���� ���ڿ��� ����
		System.out.println("sf : " + sf);
		sf.insert(2, "~~~~~"); // offset�� ��Ÿ���� ���ڴ� ���° �迭���ں��� ������ ������
		System.out.println("sf : " + sf);
		
		sf.delete(1, 10);
		System.out.println("sf : " + sf);
		
		//StringBuilder
		StringBuilder sd = new StringBuilder("java world");
		sd.append("~~~~~");
		System.out.println("sd : " + sd);
		
	}
	
}
