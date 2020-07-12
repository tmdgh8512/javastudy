package java_class16_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {
	// Exception이란 프로그램에 문제가 있는 것을 말하며, 예외로 인해 시스템 동작이 멈추는 것을 막는 것을 '예외처리'라고 한다.
	// NullPointerException - 객체를 가리키지 않고 있는 레퍼런스를 이용할 때
	// ArrayIndexOutOfBoundException - 배열에서 존재하지 않는 인덱스를 가리킬 때
	// NumberFormatException - 숫자데이터에 문자데이터등을 넣었을 때
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception BEFORE");
		// try ~ catch - 개발자가 예외처리하기 가장 쉽고, 많이 사용되는 방법
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
		} finally { // 예외 발생 여부에 상관없이 반드시 실행된다.
			System.out.println("예외 발생 여부에 상관없이 언제나 실행 됩니다. ");
		}
		
		System.out.println("Exception AFTER");
		
	}
	
}
