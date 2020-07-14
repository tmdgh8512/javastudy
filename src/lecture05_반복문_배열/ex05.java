package lecture05_반복문_배열;

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
	// for(타입이름 임시변수명 : 반복대상객체)로 사용될수도 있다.
}