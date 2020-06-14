package javastudy;

// 연산자
public class class_6 {

	public static void main(String[] args) {
		// 대입 연산자 - 오른쪽의 결과를 왼쪽에 대입(할당) 한다.
		int x = 10;
		int y = 20;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = y; // <-- x값에 y값을 대입한다.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("---------------------");

		// 산술 연산자 - 피연산자를 이용해서 +, -, *, /, %를 수행한다.
		x = 10;
		y = 20;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y)); // a,b는 정수이므로 a/b도 정수로 표현되면 0이 된다.
		System.out.println("x / y = " + ((double) x / (double) y)); // a,b를 실수로 형변환하여 결과값을 소수점으로 나타냄
		System.out.println("x % y = " + (x % y));
		System.out.println("---------------------");

		// 복합대입 연산자 - 산술 연산자와 대입 연산자를 결합한 연산자이다.
		x = 10;
		System.out.println("x += 10 --> " + (x += 10)); // x = x + 10
		x = 10;
		System.out.println("x -= 10 --> " + (x -= 10)); // x = x - 10
		x = 10;
		System.out.println("x *= 10 --> " + (x *= 10)); // x = x * 10
		x = 10;
		System.out.println("x /= 10 --> " + (x /= 10)); // x = x / 10
		x = 10;
		System.out.println("x %= 10 --> " + (x %= 10)); // x = x % 10
		System.out.println("---------------------");

		// 관계 연산자 - 두개의 피연산자를 비교해서 참/거짓을 돌출한다.
		x = 10;
		y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println("---------------------");

		// 증감 연산자 - 1만큼 증가하거나 감소를 수행한다.
		x = 10;
		System.out.println("++x --> " + (++x)); // x = x + 1
		x = 10;
		System.out.println("--x --> " + (--x)); // x = x - 1
		x = 10;
		System.out.println("x++ --> " + (x++));
		System.out.println("x --> " + x);
		x = 10;
		System.out.println("x-- --> " + (x--));
		System.out.println("x --> " + x);
		System.out.println("---------------------");

		// 논리 연산자 - 피연산자의 논리곱(AND), 논리합(OR), 논리부정(NOT)을 수행한다.
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 --> " + (b1 && b2));
		System.out.println("b1 || b2 --> " + (b1 || b2));
		System.out.println("!b1 --> " + !b1);
		System.out.println("!b2 --> " + !b2);
		System.out.println("---------------------");

		// 조건(삼항) 연산자 - 삼항 연산자로 두개의 피연산자 연산 결과에 따라서 나머지 피연산자가 결정된다.
		// 조건식 ? 식1 : 식2 <-- 조건식이 참이면 식1이 실행하고, 조건식이 거짓이면 식2가 실행한다.

		x = 10;
		y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result = " + result);
		result = (x < y) ? 100 : 200;
		System.out.println("result = " + result);
		result = (x == y) ? 100 : 200;
		System.out.println("result = " + result);
		System.out.println("---------------------");

		// 비트 연산자 - 데이터를 bit단위로 환산하여 연산을 수행하며, 다른 연산자보다 연산 속도가 향상된다.
		x = 2; // 2를 2진수로 10
		y = 3; // 3을 2진수로 11
		System.out.println("x & y --> " + (x & y));
		System.out.println("x | y --> " + (x | y));
		System.out.println("x ^ y --> " + (x ^ y));
		System.out.println("---------------------");

	}

}
