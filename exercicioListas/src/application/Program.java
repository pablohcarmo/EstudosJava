package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Correção -> https://youtu.be/Xj-osdBe3TE
		
		// Tipo genérico
		List<Employee> employeesList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:\nId: ", i + 1);
			Integer id = sc.nextInt();
			
			// Enquanto existir esse ID digitado na lista
			while(hasId(employeesList, id)) {
				System.out.println("ID already taken!\nTry again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			//Objeto sendo criado primeiramente
			Employee employee = new Employee(id, name, salary);
			
			//Objeto criado sendo inserido na lista
			employeesList.add(employee);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		// 1º método de busca
		// Usando expressões lambda, filtrando o primeiro que atenda ao predicado ou retornando nulo
		Employee emp = employeesList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// 2º método de busca
		/*
		Integer pos = idPosition(employeesList, id);
		if(pos == -1) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeesList.get(pos).increaseSalary(percentage);
		}
		*/
			
		System.out.println("\nList of employees:");
		for(Employee empList : employeesList) {
			System.out.println(empList);
		}
		
		sc.close();
	}
	
	// Objetivo desta função é retornar a posição de um elemento na lista
	public static int idPosition(List <Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	
	// Função que verifica se o ID digitado pelo usuário já existe na lista
	public static boolean hasId (List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
