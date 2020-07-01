package javapractice_4;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		int [] iArr = {10, 20, 30};
		ObjectClass obj2 = new ObjectClass("Hello", iArr);
		
		
		ObjectClass obj3 = new ObjectClass(10,20);
		obj3.getInfo();
	}

}
