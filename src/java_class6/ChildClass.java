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
	@Override // �޼��� �������̵� - �θ� Ŭ������ ����� �ڽ� Ŭ�������� �������ؼ� ����Ѵ�.
	public void makeJJajang() {
		
		System.out.println(" -- more makeJJajang --");
		
	}
}
