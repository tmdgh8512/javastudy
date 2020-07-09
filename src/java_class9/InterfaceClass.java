package java_class9;

public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass() {
		System.out.println(" -- InterfaceClass contruct --");
	}
	
	@Override
	public void funA() {
		// TODO Auto-generated method stub
		System.out.println(" -- funA --");
		
	}

	@Override
	public void funB() {
		// TODO Auto-generated method stub
		System.out.println(" -- funB --");
		
	}
	
}
