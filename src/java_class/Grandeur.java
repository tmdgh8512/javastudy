package java_class;
//Ŭ������ ��� ����(�Ӽ�), �޼���(���), ������ ������ �����ȴ�.
public class Grandeur { // Ŭ���� �̸� : �Ϲ������� ù���ڴ� �빮�ڷ� �Ѵ�.
	
	public String color;
	public String gear;		// ��� ���� (�Ӽ�)
	public int price;
	
	public Grandeur() { // ������
		// TODO Auto-generated constructor stub
		System.out.println("Grandeur constructor");
	}
	
	public void run() {		// �޼���(���)
		System.out.println("-- run --");
	}
	
	public void stop() {	// �޼���(���)
		System.out.println("-- stop --");
	}
	
	public void info() {		// �޼���(���)
		System.out.println("-- info() --");
		System.out.println("color " + color);
		System.out.println("gear " + gear);
		System.out.println("price " + price);
	}
	
}
