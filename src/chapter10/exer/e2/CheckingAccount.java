package chapter10.exer.e2;

public class CheckingAccount extends BankAccount {
	//필드
	private SavingsAccount protectedBy;

	//생성자
	public CheckingAccount(int balance) {
		super(balance); 
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance); 
		this.protectedBy = protectedBy;
	}
	
	/**
	 * 체크 계좌에서 출금
	 * 잔액보다 더 많은 금액을 인출하려고 하면 초과되는 양만큰
	 * SavingsAccount에서 출금
	 */
	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			protectedBy.balance -= amount-this.balance;
			this.balance = 0;
			return true;
		} else {
			this.balance -= amount;
			return false;
		}
		
	}
	
	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}