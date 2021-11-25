package exer.ex07.e3;

public class Customer {
	//필드
	private String firstName;        //고객명
	private String lastName; 		 //고객 성
	private BankAccount account;     //고객이 소유한 계좌
	
	//생성자
	public Customer(String firstName, String lastName) {
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

	@Override
	public String toString() {
		return "이름: " + getFirstName() + " " + getLastName() + ", 잔고: " + account + "원";
	}
	
	
	
	
	
}
