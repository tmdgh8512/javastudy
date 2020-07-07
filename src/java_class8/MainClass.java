package java_class8;

public class MainClass {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);
		System.out.println();
		// 멤버 inner 클래스
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : " + in.num);
		System.out.println("in.str2 : " + in.str2);

		System.out.println();
		// static inner 클래스
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : " + si.num);
		System.out.println("si.str3 : " + si.str3);
		System.out.println();

		new AnonymousClass() {
		// 익명클래스 - 이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용된다.
		// 익명클래스는 인터페이스나 추상클래스에서 주로 이용된다.
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			};

		}.method();

	}

}
