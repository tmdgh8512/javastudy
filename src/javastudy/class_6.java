package javastudy;

// ������
public class class_6 {

	public static void main(String[] args) {
		// ���� ������ - �������� ����� ���ʿ� ����(�Ҵ�) �Ѵ�.
		int x = 10;
		int y = 20;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = y; // <-- x���� y���� �����Ѵ�.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("---------------------");

		// ��� ������ - �ǿ����ڸ� �̿��ؼ� +, -, *, /, %�� �����Ѵ�.
		x = 10;
		y = 20;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y)); // a,b�� �����̹Ƿ� a/b�� ������ ǥ���Ǹ� 0�� �ȴ�.
		System.out.println("x / y = " + ((double) x / (double) y)); // a,b�� �Ǽ��� ����ȯ�Ͽ� ������� �Ҽ������� ��Ÿ��
		System.out.println("x % y = " + (x % y));
		System.out.println("---------------------");

		// ���մ��� ������ - ��� �����ڿ� ���� �����ڸ� ������ �������̴�.
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

		// ���� ������ - �ΰ��� �ǿ����ڸ� ���ؼ� ��/������ �����Ѵ�.
		x = 10;
		y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println("---------------------");

		// ���� ������ - 1��ŭ �����ϰų� ���Ҹ� �����Ѵ�.
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

		// �� ������ - �ǿ������� ����(AND), ����(OR), ������(NOT)�� �����Ѵ�.
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 --> " + (b1 && b2));
		System.out.println("b1 || b2 --> " + (b1 || b2));
		System.out.println("!b1 --> " + !b1);
		System.out.println("!b2 --> " + !b2);
		System.out.println("---------------------");

		// ����(����) ������ - ���� �����ڷ� �ΰ��� �ǿ����� ���� ����� ���� ������ �ǿ����ڰ� �����ȴ�.
		// ���ǽ� ? ��1 : ��2 <-- ���ǽ��� ���̸� ��1�� �����ϰ�, ���ǽ��� �����̸� ��2�� �����Ѵ�.

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

		// ��Ʈ ������ - �����͸� bit������ ȯ���Ͽ� ������ �����ϸ�, �ٸ� �����ں��� ���� �ӵ��� ���ȴ�.
		x = 2; // 2�� 2������ 10
		y = 3; // 3�� 2������ 11
		System.out.println("x & y --> " + (x & y));
		System.out.println("x | y --> " + (x | y));
		System.out.println("x ^ y --> " + (x ^ y));
		System.out.println("---------------------");

	}

}
