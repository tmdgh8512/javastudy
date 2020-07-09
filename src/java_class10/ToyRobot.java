package java_class10;

public class ToyRobot implements Toy {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The robot can walk");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The robogt can run");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("The robot has no alarm function");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("The robot has light function");
	}

}
