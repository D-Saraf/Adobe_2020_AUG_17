package com.adobe.prj.dao;

import com.adobe.prj.entity.Employee;

public class EmployeeDaoMongoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee e) {
		System.out.println("stored in mongodb !!!");
	}

	@Override
	public Employee getEmployee(int id) {
		return null;
	}
	
	public void connect( ) {
		
	}
}
