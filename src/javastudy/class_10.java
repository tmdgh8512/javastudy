package javastudy;

import java.util.Scanner;

// �ݺ��� - ���α׷� ������ Ư�� ���ǿ� ���� �ݺ������� �����ϴ� ���̴�.
public class class_10 {

	public static void main(String[] args) {

		// for��
		System.out.print("���ڸ� �Է��ϼ���. ");
		Scanner Number = new Scanner(System.in);
		int number = Number.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ", number, i, (number * i));
		}
		System.out.println("--------------------------");

		// while��
		System.out.print("���ڸ� �Է��ϼ���. ");
		int num = Number.nextInt();
		int j = 1;
		while (j < 10) {
			System.out.printf("%d * %d = %d\n", num, j, (num * j));
			j++;
		}

		/*
		 * do ~ while�� - while���� ����ϸ�, �������� ���� ����� ������� ������ �����ѹ��� {...}�� ���α׷��� �����Ѵ�.
		 */

		int k = 10;
		do {
			System.out.println("�� ������ ������ �����մϴ�.");
			k++;
		} while (k < 13);
	}

}
