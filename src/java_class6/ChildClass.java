package java_class6;

public class ChildClass extends ParentClass {

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass construct");
	}
	
	public void childFun() {
		
		System.out.println("childFun");
		
	}
	
	/* private void childFunny() {
		
		System.out.println("childFunny");
		
	} */
	@Override // 메서드 오버라이드 - 부모 클래스의 기능을 자식 클래스에서 재정의해서 사용한다.
	public void makeJJajang() {
		
		System.out.println(" -- more makeJJajang --");
		
	}
}
