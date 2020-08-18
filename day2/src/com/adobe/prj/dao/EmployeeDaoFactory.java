package com.adobe.prj.dao;

import java.util.ResourceBundle;

public class EmployeeDaoFactory {
	
	private static String str = "";
	// properites.properties in "config" package
	static {
		ResourceBundle res = ResourceBundle.getBundle("config");
		str = res.getString("EMP_DAO").trim();
	}
	
	// factory method
	public static EmployeeDao getEmployeeDao() {
//		return new EmployeeDaoMySqlImpl();
		try {
			return (EmployeeDao) Class.forName(str).newInstance();
		} catch(Exception ex) {
			return null;
		}
	}
	
}
