package javastudy;

import java.util.Scanner;

// ���ǹ� - ������ ����� ���� ���� ���� �Ǵ� ���� ������ �����Ѵ�.

public class class_9 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		// if(���ǽ�)
		if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}

		System.out.println("----------------------------");

		// if, else
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		} else {
			System.out.println("num1�� num2���� �۰ų� ����.");
		}

		System.out.println("----------------------------");

		// if, else if
		if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		} else if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		} else {
			System.out.println("num1�� num2�� ũ�Ⱑ ����.");
		}

		// ������ ������ �����ϰ� �����
		if (true) {
			System.out.println("������ ����ȴ�."); // test�� ������Ҷ� ���δ�.
		}

		System.out.println("----------------------------");

		// Switch�� - �񱳴���� �Ǵ� ������� ���û����� ���� ��� �ַ� ����Ѵ�.

		System.out.print("������ �Է��ϼ���. ");
		Scanner inputnum = new Scanner(System.in);
		int score = inputnum.nextInt();

		switch (score) {
		case 90:
			System.out.println("score is 90");
			break;

		case 80:
			System.out.println("score is 80");
			break;

		case 70:
			System.out.println("score is 70");
			break;

		case 60:
			System.out.println("score is 60");
			break;
		case 50:
			System.out.println("score is 50");
			break;

		default:
			System.out.println("score is ???");
			break;
		}

	}

}
