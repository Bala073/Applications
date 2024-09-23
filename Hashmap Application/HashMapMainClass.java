package com.evergent.corejava.HashMap;

import java.util.Scanner;

public class HashMapMainClass {
	public static void main(String[] args) {
		int empId;
		String empName;
		String empDpart;
		casestudyHashMap cs=new casestudyHashMap();
		//EmployeeBean eb=new EmployeeBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Add employee details:");
		System.out.println("2.retrive employee details:");
		System.out.println("3.update employee details:");
		System.out.println("4.remove employee details:");
		System.out.println("5.display employee details:");
		System.out.println("6.exit:");
		int value=sc.nextInt();
		switch(value)
		{
		case 1:
			System.out.println("enter empid:");
			empId=sc.nextInt();
			System.out.println("enter empName:");
			empName=sc.next();
			System.out.println("enter empDepartment:");
			empDpart=sc.next();
			EmployeeBean eb = new EmployeeBean();
            eb.setEmpName(empName);
            eb.setEmpDpart(empDpart);
			cs.addEmployee(empId,eb);
			break;
		case 2:
			System.out.println("enter empid:");
			empId=sc.nextInt();
			cs.retrival(empId);
			break;
		case 3:
			System.out.println("enter empid:");
			empId=sc.nextInt();
			System.out.println("enter empName:");
			empName=sc.next();
			System.out.println("enter empDepartment:");
			empDpart=sc.next();
			EmployeeBean eb1 = new EmployeeBean();
            eb1.setEmpName(empName);
            eb1.setEmpDpart(empDpart);
			cs.update(empId,eb1);
			break;
		case 4:
			System.out.println("enter empid:");
			empId=sc.nextInt();
			cs.remove(empId);
			break;
		case 5:
			cs.display();
			break;
		case 6:
			cs.exit();
			break;
		}
		
	}
	}

}
