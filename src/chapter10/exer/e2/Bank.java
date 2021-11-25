package chapter10.exer.e2;

public class Bank {
    private Customer[] customers;   //은행의 고객 목록
    private int numberOfCustomers;  //은행의 고객 수

    public Bank() {
        customers = new Customer[10];
    }

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
