package javastudy;

import java.util.Scanner;

// �迭 - �ε����� �̿��ؼ� �ڷ����� ���� �����͸� �����ϴ� ���̴�. 
// �ڹٿ����� �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����.
public class class_7 {

	public static void main(String[] args) {
		
		// �迭 ���� �� �ʱ�ȭ����
		int[] arr1 = new int[5]; //�迭 ���� �ܰ�
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
		
		// �迭 ����� �ʱ�ȭ�� ���ÿ� �ϴ� ���
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println("arr2[2] = " + arr2[2]);
		System.out.println("arr2[3] = " + arr2[3]);
		System.out.println("arr2[4] = " + arr2[4]);
		System.out.println("------------------------");
		
		// �迭�� �̿��� �б� ����
		Scanner scanner = new Scanner(System.in); // ����ڷκ��� �����͸� ���� �� ���� class
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"};
		int[] score = new int[5];
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : " , name[0]);
		score[0] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : " , name[1]);
		score[1] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : " , name[2]);
		score[2] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : " , name[3]);
		score[3] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : " , name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s ���� : %.2f��\n ", name[0], (double)score[0]);
		System.out.printf("%s ���� : %.2f��\n ", name[1], (double)score[1]);
		System.out.printf("%s ���� : %.2f��\n ", name[2], (double)score[2]);
		System.out.printf("%s ���� : %.2f��\n ", name[3], (double)score[3]);
		System.out.printf("%s ���� : %.2f��\n ", name[4], (double)score[4]);
		
		double average = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		
		System.out.printf("�츮 �б��� �� ����� = %.2f�̴�. \n", average);
		
		scanner.close(); // ���ҽ� ��ȯ
		
	}
	
}
