package java_class6;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		childClass.childFun();
		childClass.parentFun();
		// childClass.childFunny(); <- ����̶� private �������� �Ӽ��� �޼���� ����� �� ����. 
		
		ChildClass child = new ChildClass();
		child.makeJJajang();
		
		
	}
	
}
