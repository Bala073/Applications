package com.evergent.corejava.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class casestudyHashMap {
	HashMap employeeMap =new HashMap();
	int empId;
	//EmployeeBean eb=new EmployeeBean(String empName, String empDpart);
	public void addEmployee(int empId,EmployeeBean eb)
	{
		employeeMap.put(empId,eb);
		System.out.println("employee added:"+employeeMap);
	}
	public void retrival(int empId)
	{
		if(employeeMap.containsKey(empId))
		{
		   System.out.println( employeeMap.get(empId));
		    //System.out.println("employeeId: "+empId+" employeeName: "+eb.getEmpName()+" employee department: "+eb.getEmpDpart());
		}
		else {
			System.out.println("the map does not contain the key value..");
		}
	}
	public void update(int empId,EmployeeBean eb)
	{
		if(employeeMap.containsKey(empId))
		{
			employeeMap.put(empId,eb);
			System.out.println( employeeMap.get(empId)+" updated successfully...");
			
		}
		else {
			System.out.println("the map does not contain the key value..");
		}
	}
	public void remove(int empId)
	{
		if(employeeMap.containsKey(empId))
		{
		employeeMap.remove(empId);
		System.out.println(empId+" employee details deleted from map successfully....");
		}
		else {
			System.out.println("the map does not contain the key value..");
		}
	}
	public void display()
	{
Iterator<Map.Entry<Integer, EmployeeBean>> itr = employeeMap.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry<Integer, EmployeeBean> entry = itr.next();
            Integer key = entry.getKey();
            EmployeeBean employee = entry.getValue();
            
            System.out.println("Key: " + key +" " + employee);
        }
	}
	public void exit()
	{
		System.exit(0);
	}

}
