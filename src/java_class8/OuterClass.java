package java_class8;

public class OuterClass {

	int num = 10;
	String str1 = "java";
	static String str11 = "world";

	public OuterClass() {

		System.out.println("OuterClass constructor");
	}

	class InnerClass {
		int num = 100;
		String str2 = str1;

		public InnerClass() {
			// 내부(inner)클래스 - 클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있다.
			System.out.println("InnerClass constructor");
		}

	}

	static class SInnerClass {

		int num = 1000;
		String str3 = str11;

		public SInnerClass() {

			System.out.println("static InnerClass constructor");
		}

	}

}
