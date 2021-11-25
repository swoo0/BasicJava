package chapter08.exer.e02;

public class SavingsAccount extends BankAccount {
	//필드
	public double interestRate;  //이자율

	//생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * 결산 이자
	 * @param period: 기간
	 */
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
		     // += 연산자 사용 시 좌우 변수 타입 차이로 강제 형변환 해주지 않아도
		     //    형변환이 내부적으로 자동 수행 됨
	}

	@Override
	public String getAccountType() {
		return "저축예금";
	}
	
}