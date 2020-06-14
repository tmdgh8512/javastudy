package javastudy;

import java.util.Scanner;

// 조건문 - 조건의 결과에 따라서 양자 택일 또는 다자 택일을 진행한다.

public class class_9 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		// if(조건식)
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		}

		System.out.println("----------------------------");

		// if, else
		if (num1 > num2) {
			System.out.println("num1은 num2보다 크다.");
		} else {
			System.out.println("num1은 num2보다 작거나 같다.");
		}

		System.out.println("----------------------------");

		// if, else if
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		} else if (num1 > num2) {
			System.out.println("num1은 num2보다 크다.");
		} else {
			System.out.println("num1과 num2는 크기가 같다.");
		}

		// 무조건 참으로 실행하게 만들기
		if (true) {
			System.out.println("무조건 실행된다."); // test나 디버깅할때 쓰인다.
		}

		System.out.println("----------------------------");

		// Switch문 - 비교대상이 되는 결과값과 선택사항이 많을 경우 주로 사용한다.

		System.out.print("점수를 입력하세요. ");
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
