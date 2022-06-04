package org.emp;

public class Employee {
	private void empId() {
		System.out.println("ID:001");
	}
	private void empName() {
		System.out.println("Name: Tharun");
	}
	private void empDob() {
		System.out.println("DOB : 01/11/1997");
    }
	private void empPhone() {
	    System.out.println("phone:9876543210");
    }
	private void empEmail() {
		System.out.println("Email:tharun@gmail.com");
    }
	private void empAddress() {
		System.out.println("address:no1,1st street,abc nagar,cgl");
    }
   public static void main(String[] args) {
	Employee details = new Employee();
	details.empId();
	details.empName();
	details.empDob();
	details.empPhone();
	details.empEmail();
	details.empAddress();
}
}
