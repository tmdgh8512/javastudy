package javastudy;

import java.util.Arrays;

// �迭 2

public class class_8 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = null;
		int[] arr3 = null;

		// �迭 ����
		System.out.println("arr1.length = " + arr1.length);

		// �迭 ��� ���
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		// �迭 ��� ����
		arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		System.out.println(arr3); // �迭�� ���� ���� ���൵ �ּҴ� �ٸ���.

		// �迭 ���۷���
		arr2 = arr1; // �ּҸ� ���� ������ָ� �迭 �ȿ� �ִ� ���鵵 ����.
		System.out.println("arr1�� �ּҴ� " + arr1);
		System.out.println("arr2�� �ּҴ� " + arr2);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3�� �ּҴ� " + arr3);
		System.out.println("-------------------------");

		// ������ �迭
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

		// ������ �迭����

		arrmul2 = Arrays.copyOf(arrmul1, arrmul1.length);
		System.out.println("arrmul2[0] : " + Arrays.toString(arrmul2[0]));
		System.out.println("arrmul2[1] : " + Arrays.toString(arrmul2[1]));
		System.out.println("arrmul2[2] : " + Arrays.toString(arrmul2[2]));

	}

}
