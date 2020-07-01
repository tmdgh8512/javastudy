package java_class2;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name = "±è½ÂÈ£";
		child1.age = 26;
		child1.gender= "³²";
		
		child1.getInfo();
		
		child1.setInfo("È«±æµ¿", "³²", 21);
		child1.getInfo();
		
	}
	
}
