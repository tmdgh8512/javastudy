package javastudy;
//�⺻�ڷ���
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
		
		//�� ��ȯ
		// �ڵ�(������) �� ��ȯ
		// ���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by = 10;
		int in = by;
		System.out.println("in = " + in );
		
		//������ �� ��ȯ
		//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar); // <-- �Ҵ���� �޸� �뷮�� �ʰ��ؼ� �����Ͱ� ���ǵ� ��

	}

}