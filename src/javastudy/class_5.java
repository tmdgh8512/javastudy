package javastudy;

//Ư�����ڿ� ���Ĺ���
public class class_5 {

	public static void main(String[] args) {

		// Ư������
		System.out.println("Good\tMorning~");
		System.out.println("---------------");
		System.out.println("Good\nMorning~");
		System.out.println("---------------");
		System.out.println("Good\'Morning\'~");
		System.out.println("---------------");
		System.out.println("Good\"Morning~\"");
		System.out.println("---------------");
		System.out.println("Good\\Morning~\\");
		System.out.println("---------------");

		// ���Ĺ���
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);

		int num1 = 20;
		System.out.println("������ ����� " + num1 + "�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", num1);

		System.out.printf("ȫ�浿's info. : %d�г� %d�� %d��\n", 6, 2, 6);

		// ����
		int num2 = 30;
		System.out.printf("num2(10����) : %d\n", num2);
		System.out.printf("num2(8����) : %o\n", num2);
		System.out.printf("num2(16����) : %x\n", num2);

		// ����
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("�ҹ��� '%c'�� �빮�ڴ� '%c'�Դϴ�.\n", c1, c2);

		// ���ڿ�
		System.out.printf("\"%s\"�� �빮�ڷ� �ٲٸ� \"%s\"�Դϴ�.\n", "java", "JAVA");

		// �Ǽ�
		float f = 1.23f;
		System.out.printf("f = %f\n", f);

		double d = 1.23456d;
		System.out.printf("d = %f\n", d);

	}

}
