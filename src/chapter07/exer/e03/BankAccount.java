package chapter07.exer.e03;

public class BankAccount {
	private int balance; //잔액 

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {  //현재 계좌의 잔액
		return balance;
	}

	/**
	 * 입금
	 * @param amount: 입금할 금액
	 */
	public void deposit(int amount) {
		balance += amount;
	}

	/**
	 * 출금
	 * @param amount : 출금할 금액
	 * @return 출금 여부
	 */
	public boolean withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
			return true;
		} else
			return false;
	}
	
	/**
	 * 계좌 이체
	 * @param amount : 이체할 금액
	 * @param otherAccount : 받는 분 계좌 번호
	 * @return 
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) {    //출금할 계좌에서 출금
			otherAccount.deposit(amount);  //입금 받을 계좌에 입금
		} 
		return true;
	}

	public String toString() {
		return "잔액: " + balance;
	}
	
}
