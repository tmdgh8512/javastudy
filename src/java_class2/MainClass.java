package java_class2;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name = "���ȣ";
		child1.age = 26;
		child1.gender= "��";
		
		child1.getInfo();
		
		child1.setInfo("ȫ�浿", "��", 21);
		child1.getInfo();
		
	}
	
}
