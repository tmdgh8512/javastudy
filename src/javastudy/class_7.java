package javastudy;

import java.util.Scanner;

// 배열 - 인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것이다. 
// 자바에서의 배열은 한번 크기가 정해지면 크기를 변경할 수 없다.
public class class_7 {

	public static void main(String[] args) {
		
		// 배열 선언 후 초기화과정
		int[] arr1 = new int[5]; //배열 선언 단계
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1[2] = " + arr1[2]);
		System.out.println("arr1[3] = " + arr1[3]);
		System.out.println("arr1[4] = " + arr1[4]);
		System.out.println("------------------------");
		
		// 배열 선언과 초기화를 동시에 하는 방법
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println("arr2[2] = " + arr2[2]);
		System.out.println("arr2[3] = " + arr2[3]);
		System.out.println("arr2[4] = " + arr2[4]);
		System.out.println("------------------------");
		
		// 배열을 이용한 학급 관리
		Scanner scanner = new Scanner(System.in); // 사용자로부터 데이터를 받을 때 쓰는 class
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int[] score = new int[5];
		
		System.out.printf("%s의 점수를 입력하시오. : " , name[0]);
		score[0] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : " , name[1]);
		score[1] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : " , name[2]);
		score[2] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : " , name[3]);
		score[3] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : " , name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 점수 : %.2f점\n ", name[0], (double)score[0]);
		System.out.printf("%s 점수 : %.2f점\n ", name[1], (double)score[1]);
		System.out.printf("%s 점수 : %.2f점\n ", name[2], (double)score[2]);
		System.out.printf("%s 점수 : %.2f점\n ", name[3], (double)score[3]);
		System.out.printf("%s 점수 : %.2f점\n ", name[4], (double)score[4]);
		
		double average = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		
		System.out.printf("우리 학급의 총 평균은 = %.2f이다. \n", average);
		
		scanner.close(); // 리소스 반환
		
	}
	
}
