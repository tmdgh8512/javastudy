package javastudy;
//기본자료형
public class class_4 {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println("c = " + c);
		int i = 10;
		System.out.println("i = " + i);
		double d = 10.258;
		System.out.println("d = " + d);
		boolean b = false;
		System.out.println("b = " + b);

		String s = "Hello Java World!";
		System.out.println("s = " + s);
	
		s = "Good";
		System.out.println("s = " + s);
		
		//형 변환
		// 자동(묵시적) 형 변환
		// 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10;
		int in = by;
		System.out.println("in = " + in );
		
		//명시적 형 변환
		//큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar); // <-- 할당받은 메모리 용량을 초과해서 데이터가 누실된 예

	}

}
