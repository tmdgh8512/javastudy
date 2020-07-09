package java_class10_1;

import java_class10.Toy;
import java_class10.ToyAirplane;
import java_class10.ToyRobot;


public class MainClass {
	public static void main(String[] args) {
		
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		
		for (int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
		
		
	}
}
