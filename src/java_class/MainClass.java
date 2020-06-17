package java_class;

public class MainClass {

	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur(); // 클래스로부터 'new'를 이용해서 객체를 생성 한다.
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Grandeur myCar2 = new Grandeur();
		myCar2.color = "yellow";
		myCar2.gear = "auto";
		myCar2.price = 500;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "red";
		myBicycle.price = 100;
		
		myBicycle.info();
		
		Bicycle myBicycle2 = new Bicycle("blue" , 100);
		myBicycle2.info();
		
		myBicycle2.color = "yellow";
		myBicycle2.info();
		
	}
	
}
