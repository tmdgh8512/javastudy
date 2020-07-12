package java_class16_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {
	// Exception�̶� ���α׷��� ������ �ִ� ���� ���ϸ�, ���ܷ� ���� �ý��� ������ ���ߴ� ���� ���� ���� '����ó��'��� �Ѵ�.
	// NullPointerException - ��ü�� ����Ű�� �ʰ� �ִ� ���۷����� �̿��� ��
	// ArrayIndexOutOfBoundException - �迭���� �������� �ʴ� �ε����� ����ų ��
	// NumberFormatException - ���ڵ����Ϳ� ���ڵ����͵��� �־��� ��
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception BEFORE");
		// try ~ catch - �����ڰ� ����ó���ϱ� ���� ����, ���� ���Ǵ� ���
		try {
			
			System.out.println("input i : ");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();
			
			System.out.println("i / j = " + (i / j));
			
			for (int k = 0; k < 6; k++) {
				System.out.println("iArr{" + k  + " } : " + iArr[k]);
			}
			
			System.out.println("list.size() : " + list.size());
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // ���� �߻� ���ο� ������� �ݵ�� ����ȴ�.
			System.out.println("���� �߻� ���ο� ������� ������ ���� �˴ϴ�. ");
		}
		
		System.out.println("Exception AFTER");
		
	}
	
}
