package java_class7;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass[] parentArray = new ParentClass[2];
		
		FirstChildClass firstChild = new FirstChildClass();
		// ParentClass firstChild = new FirstChildClass(); <-- �����̶� ���� ��(���� ��ӵǾ� �ֱ⶧���� �����ϴ�) 
		SecondChildClass secondChild = new SecondChildClass();
		// ParentClass secondChild = new SecondChildClass(); <-- �����̶� ���� ��(���� ��ӵǾ� �ֱ⶧���� �����ϴ�)
	
		parentArray[0] = firstChild;
		parentArray[1] = secondChild;
		
		for (int i = 0; i < parentArray.length; i++) {
			parentArray[i].makeJJajang();
		}
	}
	
	// ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ�����̴�.
	
}
