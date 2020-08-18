package com.adobe.prj.dao;

import com.adobe.prj.entity.Employee;

public class EmployeeDaoMySqlImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee e) {
		System.out.println("Employee added in MySQL !!!");
	}

	@Override
	public Employee getEmployee(int id) {
		return null;
	}

}
