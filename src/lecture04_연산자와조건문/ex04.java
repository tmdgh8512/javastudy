package lecture04_�����ڿ����ǹ�;

public class ex04 {

	public static void main(String[] args) {
		
		ex04 sample = new ex04();
		sample.casting();
		
	}
	// �ڷ����� ����ȯ
	public void casting() {
		
		byte byteVal = 127;
		short shortVal = byteVal;
		
		shortVal++;
		
		System.out.println(shortVal);
		byteVal = (byte)shortVal;
		System.out.println(byteVal);
		// 00000000 10000000 (128)
		shortVal = 256;
		byteVal = (byte)shortVal;
		System.out.println(byteVal);
		// 00000001 00000000 (256) 
		
	}
	
}
