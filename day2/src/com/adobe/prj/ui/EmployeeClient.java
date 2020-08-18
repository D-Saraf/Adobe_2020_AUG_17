package com.adobe.prj.ui;

import com.adobe.prj.dao.EmployeeDao;
import com.adobe.prj.dao.EmployeeDaoFactory;
import com.adobe.prj.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee e = new Employee(53,"Smith");
//		EmployeeDao empDao = new EmployeeDaoMongoImpl();
		EmployeeDao empDao =   EmployeeDaoFactory.getEmployeeDao();
		empDao.addEmployee(e);
	}
}
