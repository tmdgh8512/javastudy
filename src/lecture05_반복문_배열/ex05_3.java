package lecture05_반복문_배열;

public class ex05_3 {

	static String[] month = { "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November", "December"
	};
	
	/* (int[] a) == (int a[]) 둘다 같은 뜻이다.
	 int[] a = new int[7]; <-- 7칸을 만들겠다는 뜻
	 int [] a;
	 a = new int[7]; <-- 7,8번째줄 합친게 6번째 줄이다. 즉  같은 말이다.
	* 인덱스번호는 0번부터 시작이다.
	*/
	
	public static void main(String[] args) {
		
		ex05_3 array = new ex05_3();
		/*
		array.primitiveType();
		array.referenceTypes();
		*/
		array.printArrayLength();
	}
	/*
	public void init() {
		int[] lotto = new int[7];
		lotto[0] = 3;
		lotto[1] = 6;
		lotto[2] = 21;
		lotto[3] = 25;
		lotto[4] = 30;
		lotto[5] = 40;
		lotto[6] = 2;
	}
	
	public void primitiveType() {
		byte[] byteArray = new byte[1];
		short[] shortArray = new short[1];
		int[] intArray = new int[1];
		long[] longArray = new long[1];
		float[] floatArray = new float[1];
		double[] doubleArray = new double[1];
		char[] charArray = new char[1];
		boolean[] booleanArray = new boolean[1];
		System.out.println(byteArray[0]);
		System.out.println(shortArray[0]);
		System.out.println(intArray[0]);
		System.out.println(longArray[0]);
		System.out.println(floatArray[0]);
		System.out.println(doubleArray[0]);
		System.out.println(charArray[0]);
		System.out.println(booleanArray[0]);
		System.out.println("================");
		System.out.println(byteArray);
		System.out.println(shortArray);
		System.out.println(intArray);
		System.out.println(longArray);
		System.out.println(floatArray);
		System.out.println(doubleArray);
		System.out.println(charArray);
		System.out.println(booleanArray);
	}
	
	public void referenceTypes() {
		String[] strings = new String[2];
		ex05_3[] array = new ex05_3[2];
		
		
		strings[0] = "Hello String Array";
		array[0] = new ex05_3();
		
		System.out.println("strings[0] = " + strings[0]);
		System.out.println("strings[1] = " + strings[1]);
		
		System.out.println("array[0] = " + array[0]);
		System.out.println("array[1] = " + array[1]);

		System.out.println("strings = " + strings);
		System.out.println("array = " + array);
	}
	*/
	public void printArrayLength() {
		int monthLeng= month.length;
		System.out.println(monthLeng);
	}
}
