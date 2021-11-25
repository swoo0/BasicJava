package chapter07.exer.e03;

public class Customer {
	//필드
	private String firstName;  //고객 이름
	private String lastName;   //고객 성
	private BankAccount account;  //고객이 소유한 계좌
	
	//생성자
	public Customer(String firstName, String lastName) {   //주어진 인자로 각 필드 초기화
		this.firstName = firstName;
		this.lastName = lastName;
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
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}	
	
	public String toString() {
		return "이름: " + getFirstName() + " " + getLastName()+ ", 잔고: " + account + "원";
	}
}
