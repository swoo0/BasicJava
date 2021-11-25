package chapter08.exer.e02;

public class Customer {
	//필드
	private String firstName;  //고객 이름
	private String lastName;   //고객 성

	public BankAccount[] accounts;   //고객이 소유한 계좌
	private int numberOfAccounts;     //최대 보유 가능 계좌수는 = 5 
	
	//생성자
	public Customer(String firstName, String lastName) {   //주어진 인자로 각 필드 초기화
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new BankAccount[5];     //accounts 배열의 크기를 5로 초기화
	}
		
	//메소드
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
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
		return String.format("%s %s",firstName, lastName);
//		return "이름: " + getFirstName() + " " + getLastName()+ ", 계좌의 갯수: " + getNumberOfAccounts();
	}
		
}
