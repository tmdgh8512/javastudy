package javastudy;

import java.util.Arrays;

// 배열 2

public class class_8 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = null;
		int[] arr3 = null;

		// 배열 길이
		System.out.println("arr1.length = " + arr1.length);

		// 배열 요소 출력
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		// 배열 요소 복사
		arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		System.out.println(arr3); // 배열의 값을 같게 해줘도 주소는 다르다.

		// 배열 레퍼런스
		arr2 = arr1; // 주소를 같게 만들어주면 배열 안에 있는 값들도 같다.
		System.out.println("arr1의 주소는 " + arr1);
		System.out.println("arr2의 주소는 " + arr2);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3의 주소는 " + arr3);
		System.out.println("-------------------------");

		// 다차원 배열
		int[][] arrmul1 = new int[3][2];
		arrmul1[0][0] = 10;
		arrmul1[0][1] = 100;
		arrmul1[1][0] = 20;
		arrmul1[1][1] = 200;
		arrmul1[2][0] = 30;
		arrmul1[2][1] = 300;

		System.out.println("arrmul1[0] : " + Arrays.toString(arrmul1[0]));
		System.out.println("arrmul1[1] : " + Arrays.toString(arrmul1[1]));
		System.out.println("arrmul1[2] : " + Arrays.toString(arrmul1[2]));

		int[][] arrmul2 = { { 3, 2 }, { 30, 20 }, { 300, 200 } };
		System.out.println("arrmul2[0] : " + Arrays.toString(arrmul2[0]));
		System.out.println("arrmul2[1] : " + Arrays.toString(arrmul2[1]));
		System.out.println("arrmul2[2] : " + Arrays.toString(arrmul2[2]));

		// 다차원 배열복사

		arrmul2 = Arrays.copyOf(arrmul1, arrmul1.length);
		System.out.println("arrmul2[0] : " + Arrays.toString(arrmul2[0]));
		System.out.println("arrmul2[1] : " + Arrays.toString(arrmul2[1]));
		System.out.println("arrmul2[2] : " + Arrays.toString(arrmul2[2]));

	}

}
