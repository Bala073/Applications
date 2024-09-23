package com.evergent.corejava.HashMap;

public class EmployeeBean {
	//private int empId;
	private String empName;
	private String empDpart;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDpart() {
		return empDpart;
	}
	public void setEmpDpart(String empDpart) {
		this.empDpart = empDpart;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + empName + ", Department: " + empDpart;
	}
	

}
