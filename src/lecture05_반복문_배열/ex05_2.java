/* ������ ���ϴ� Ŭ����
   public double getInterestRate(int day)
   ���ڸ� �Ű������� �޾� double Ÿ���� ������ ������ ����
   ��ġ�Ⱓ�� 90�� �̳� : 0.5%
   			91~180�� �̳� : 2%
   		   181~364�� �̳� : 4%
   		       365~		  : 6%
   public double calculateAmount(int day, long amount)
   ���ݰ�ġ�Ⱓ, ��ġ�ݾ��� �޾� ���ݾ� ����
   getInterestRate() �޼ҵ带 ȣ���Ͽ� ���� ��� �ݾ� ����
   main���� 1~365�ϱ��� ���� 10������ ����
 */
package lecture05_�ݺ���_�迭;
 

public class ex05_2 {

	public static void main(String[] args) {
		
		ex05_2 sample = new ex05_2();
		for (int day = 1; day <= 365; day++) {
			double amount = sample.calculateAmount(day, 100000);
			System.out.print(day + " : " + amount + " ");
			if(day%20 == 0)
				System.out.println();
		}
	}
	
	public double getInterestRate(int day) {
		double interest;
		if(day <= 90) {
			interest = 0.5;
		} else if((day > 90) && (day <= 180)) {
			interest = 2;
		} else if((day > 180) && (day < 365)) {
			interest = 4;
		} else {
			interest = 6;
		}
		return interest;
	}
	
	public double calculateAmount(int day, long amount) {
		double totalAmount;
		double interest = getInterestRate(day);
		double interestAmount = amount * interest / 100.0;
		totalAmount = amount + interestAmount;
		return totalAmount;
	}
}
