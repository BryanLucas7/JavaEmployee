package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do Departamento: ");
		String departmentName=sc.nextLine();
		System.out.print("Dia do Pagamento: ");
		int payDay=sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		System.out.print("Telefone: ");
		String tel=sc.nextLine();
		Address adress= new Address(email,tel);
		Department dept= new Department(departmentName,payDay,adress);
		System.out.print("Quantos funcionários tem o departamento? ");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("Dados do funcionario %d: \n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String employeename=sc.nextLine();
			System.out.print("Salario: ");
			double salary=sc.nextInt();
			Employee employee=new Employee(employeename,salary);
			dept.addEmployee(employee);
		
			
		}
		System.out.println();
		showReport(dept);
		
			
		
		
		
		
		
		sc.close();
	}
	public static  void showReport(Department dept) {
			StringBuilder sb= new StringBuilder();
			sb.append("Folha de pagamento: \n");
			sb.append("Departamento Vendas="+dept.payroll() +"\n");
			sb.append("Pagamento realizado no dia: "+dept.getPayDay()+"\n");
			sb.append("Funcionarios: "+"\n");
		     for(Employee  i : dept.getEmployee()) {
		    	  
		    	 sb.append(i.getName()  +"\n");// o I nesse for Each se comporta como cada employee
		    	
		     }
		    sb.append("Para duvidas favor entrar em contato: "+dept.getAddress().getEmail()); 
		    System.out.print(sb);
			return;
		
		
			
			
		
	}

}
