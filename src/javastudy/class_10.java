package javastudy;

import java.util.Scanner;

// 반복문 - 프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것이다.
public class class_10 {

	public static void main(String[] args) {

		// for문
		System.out.print("숫자를 입력하세요. ");
		Scanner Number = new Scanner(System.in);
		int number = Number.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ", number, i, (number * i));
		}
		System.out.println("--------------------------");

		// while문
		System.out.print("숫자를 입력하세요. ");
		int num = Number.nextInt();
		int j = 1;
		while (j < 10) {
			System.out.printf("%d * %d = %d\n", num, j, (num * j));
			j++;
		}

		/*
		 * do ~ while문 - while문과 비슷하며, 차이점은 조건 결과에 상관없이 무조건 최초한번은 {...}의 프로그램을 수행한다.
		 */

		int k = 10;
		do {
			System.out.println("이 문장은 무조건 실행합니다.");
			k++;
		} while (k < 13);
	}

}
