package javapractice_4;

import java.util.Arrays;

public class ObjectClass {

	public int x;
	public int y;
	
	public ObjectClass() {
		
		System.out.println(" -- ObjectClass() -- ");
	}
	public ObjectClass(String n, int [] iArr) {
		System.out.println("n ---> " + n);
		System.out.println("iArr --> " + Arrays.toString(iArr));
	}
	
	public ObjectClass(int x, int y) {
		
		this.x = x; 
		this.y = y;
		
	}
	
	public void getInfo() {
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
	}
	
}
