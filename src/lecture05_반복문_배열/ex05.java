package lecture05_�ݺ���_�迭;

public class ex05 {

	public static void main(String[] args) {
		
		ex05 op = new ex05();
		op.forLoop(6);
		
	}

	public void forLoop(int end) {
		int sum = 0;
		for (int loop = 0; loop <= end; loop++) {
			sum += loop;
		}
		System.out.println("1 to " + end + " = " + sum);
	}
	// for(Ÿ���̸� �ӽú����� : �ݺ����ü)�� ���ɼ��� �ִ�.
}