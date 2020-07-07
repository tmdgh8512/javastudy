package java_class7;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass[] parentArray = new ParentClass[2];
		
		FirstChildClass firstChild = new FirstChildClass();
		// ParentClass firstChild = new FirstChildClass(); <-- 윗줄이랑 같은 뜻(서로 상속되어 있기때문에 가능하다) 
		SecondChildClass secondChild = new SecondChildClass();
		// ParentClass secondChild = new SecondChildClass(); <-- 윗줄이랑 같은 뜻(서로 상속되어 있기때문에 가능하다)
	
		parentArray[0] = firstChild;
		parentArray[1] = secondChild;
		
		for (int i = 0; i < parentArray.length; i++) {
			parentArray[i].makeJJajang();
		}
	}
	
	// 모든 클래스의 최상위 클래스는 Object 클래스이다.
	
}
