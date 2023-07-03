package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalaryDesc {
   
	 public static void main(String args[]){
	 
		List<Employee> employeeList=new ArrayList<>();
		Employee e=new Employee("e",1000d);
		Employee e2=new Employee("e2",2000d);;
		employeeList.add(e2);
		employeeList.add(e);
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
	 }
	}
