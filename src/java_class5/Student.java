package java_class5;

public class Student {

	private String name;
	private int score;
	
	public Student(String n, int s) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		
		System.out.println(" -- getInfo -- ");
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
