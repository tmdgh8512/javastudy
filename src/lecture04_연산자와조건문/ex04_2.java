package lecture04_�����ڿ����ǹ�;

public class ex04_2 {

	public static void main(String[] args) {
		
		ex04_2 sample = new ex04_2();
		//sample.ifStmt();
		//sample.ifStmt2();
		//sample.ifStmt3();
		//sample.ifStmt4(70);
		//sample.switchStmt(18);
		//sample.switchStmt2(2);
		//sample.whileLoop();
		sample.whileLoop2();
	}
	
	/*public void ifStmt() {
		if(true);
		if(true)
			System.out.println("True");
		if(true)
			System.out.println("Also true");
		if(false)
			System.out.println("False");
	} */
		// if������ true�� �ƴ� false�̹Ƿ� ���ǹ��� �������� �ʴ´�.
		
	/*public void ifStmt2() {
	
		int intValue = 10;
		
		if(intValue > 10)
			System.out.println("bigger than 10.");
		else
			System.out.println("smaller or equal than 10.");
		
		if(intValue <= 10)
			System.out.println("smaller or equal than 10.");
		else
			System.out.println("bigger than 10.");
		
	} */
	
	/*public void ifStmt3() {
		int age = 25;
		boolean isMarried = true;
		
		if(age > 25 && isMarried) {
			System.out.println("Age is over 25 and Married");
		}
		if(age > 25 || isMarried) {
			System.out.println("Age is over 25 or Married");
		
		double height = 180;
		if((age > 25 || isMarried) && height >= 180) {
			System.out.println("Age is over 25 or Married and height is over 180");
		}
		}
	}*/
	/*
	public void ifStmt4(int point) {
		if(point > 90) {
			System.out.println("A");
		} else if(point > 80) {
			System.out.println("B");
		} else if(point > 70) {
			System.out.println("C");
		} else if(point > 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}*/
	/*
	public void switchStmt(int wheelNumber) {
		switch(wheelNumber) {
		case 1:
			System.out.println("one foot bicycle.");
			break;
		case 2:
			System.out.println("bicycle.");
			break;
		case 3:
			System.out.println("three wheel car.");
			break;
		case 4:
			System.out.println("car.");
			break;
		default:
			System.out.println("another car.");
			break; // break�� �����ָ� �ؿ� ������ �Ѿ�ԵǹǷ� ���� ��Һ��� break�� ���ش�.
		}
	}*/
	
	public void switchStmt2(int month) {
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "�� has 31 days. ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "�� has 30 days. ");
			break;
		case 2:
			System.out.println(month + "�� has 28 or 29 days ");
			break;
		default:
			System.out.println(month + "�� is not a month");
			break;
		}
	}
	
	public void whileLoop() {
		int loop = 0;
		while(loop < 12) {
			loop++;
			switchStmt2(loop);
			if(loop==6) {
			 //	break; // (=)loop = 15;
			}
		}
		/*loop = 0;
		while(loop < 12) {
			if(loop==6) continue;
		}*/ // ���ѷ�������
		
	}
	
	public void whileLoop2() {
		int loop = 0;
		do {
			loop++;
			switchStmt2(loop);
		} while(loop < 0);
	}
	
}
