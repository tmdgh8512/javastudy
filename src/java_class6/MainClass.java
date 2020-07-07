package java_class6;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		childClass.childFun();
		childClass.parentFun();
		// childClass.childFunny(); <- 상속이라도 private 접근자의 속성과 메서드는 사용할 수 없다. 
		
		ChildClass child = new ChildClass();
		child.makeJJajang();
		
		
	}
	
}
