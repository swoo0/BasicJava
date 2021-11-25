package exer.ex07.e4;

public class Bank {
	//필드
	private Customer[] customers;     //은행의 고객목록
	private int numberOfCustomers;    //은행의 고객수
	
	//생성자
	public Bank() {
		customers = new Customer[10];
	}
	
	//메소드
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
