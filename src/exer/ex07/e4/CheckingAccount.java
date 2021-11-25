package exer.ex07.e4;

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
	
	//메소드
	@Override
	public boolean withdraw(int amount) {
		if(balance < amount) {
			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
			return true; 
		} else {
			this.balance -= amount;
			return false;
		}
				
	}
	
}
