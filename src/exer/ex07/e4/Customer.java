package exer.ex07.e4;

public class Customer {
	//필드
	private String firstName;        //고객명
	private String lastName; 		 //고객 성
	private BankAccount[] accounts;     //고객이 소유한 계좌
	private int numberOfAccounts;     //고객이 소유한 계좌 수
	
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new BankAccount[5];
	}	
	
	//메소드
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	
	@Override
	public String toString() {
		return "이름: " + getFirstName() + " " + getLastName() + ", 계좌의 갯수: " + numberOfAccounts;
	}
	
	
	
	
	
}
