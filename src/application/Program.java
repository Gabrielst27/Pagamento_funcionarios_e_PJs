package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Outsourced?(y/n): ");
			String aux = sc.nextLine();
			
			if(aux.toUpperCase().equals("Y")) {
				System.out.print("Enter employee's name: ");
				String name = sc.nextLine();
				System.out.print("Hours worked: ");
				int hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Enter employee's additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			} else {
				System.out.print("Enter employee's name: ");
				String name = sc.nextLine();
				System.out.print("Hours worked: ");
				int hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
		}
		
		sc.close();

	}

}
