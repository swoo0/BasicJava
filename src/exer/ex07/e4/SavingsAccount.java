package exer.ex07.e4;

public class SavingsAccount extends BankAccount {
	//필드	
	private double interestRate;
	
	//생성자
	public SavingsAccount (int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	//메소드
	public void updateBalance(int period) {
		balance += balance * interestRate * period; 
	}
}
