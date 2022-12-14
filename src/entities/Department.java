package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	private List<Employee> employee= new ArrayList<Employee>();
	private Address address;
	
	public Department() {
		
	}

	public Department(String name, Integer payDay,Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}
	public Double payroll() {
		double sum=0;
		for(Employee emp:employee) {
			sum+=emp.getSalary();
		}
		return sum;
	}

	public List<Employee> getEmployee() {
		return employee;
	}


	

}
