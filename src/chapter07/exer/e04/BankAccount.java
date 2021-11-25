package chapter07.exer.e04;

public class BankAccount {
	protected int balance; //잔액 

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {  //현재 계좌의 잔액
		return balance;
	}
	public void deposit(int amount) {  //입금 메소드
		balance += amount;
	}
	
	public boolean withdraw(int amount) {  //출금 메소드
		if (balance > amount) {
			balance -= amount;
			return true;
		} else
			return false;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {  //현재 계좌에서 amount만큼 다른 계좌로 송금
		if (withdraw(amount)) {
		otherAccount.deposit(amount);
		}
		return true;
	}
//	public String toString() {
//		return "잔액: " + balance;
//	}
		
	public String toString() {
		return String.format("%,원", balance);
	}
}