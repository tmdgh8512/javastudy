/* 이율을 구하는 클래스
   public double getInterestRate(int day)
   일자를 매개변수로 받아 double 타입의 이율이 얼마인지 구함
   거치기간이 90일 이내 : 0.5%
   			91~180일 이내 : 2%
   		   181~364일 이내 : 4%
   		       365~		  : 6%
   public double calculateAmount(int day, long amount)
   예금거치기간, 예치금액을 받아 계산금액 리턴
   getInterestRate() 메소드를 호출하여 이자 얻고 금액 리턴
   main에서 1~365일까지 매일 10만원씩 예금
 */
package lecture05_반복문_배열;
 

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
