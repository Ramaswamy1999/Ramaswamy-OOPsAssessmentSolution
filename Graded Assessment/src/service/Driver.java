package service;

import model.*;

public class Driver {

	public static void main(String[] args) {
		SuperDepartment obj1 = new SuperDepartment();
		AdminDepartment obj2 = new AdminDepartment();
		HrDepartment obj3 = new HrDepartment();
		TechDepartment obj4 = new TechDepartment();

		// Printing output for Super Department
		System.out.println(obj1.getdepartmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();

		// Printing output for Admin Department
		System.out.println(obj2.getdepartmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println();

		// Printing output for Hr Department
		System.out.println(obj3.getdepartmentName());
		System.out.println(obj3.doActivity());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.isTodayAHoliday());
		System.out.println();

		// Printing output for tech Department
		System.out.println(obj4.getdepartmentName());
		System.out.println(obj4.getTodaysWork());
		System.out.println(obj4.getWorkDeadline());
		System.out.println(obj4.getStackInformation());
		System.out.println(obj4.isTodayAHoliday());
		System.out.println();
	}

}
