package model;

public class HrDepartment extends SuperDepartment {
	public String getdepartmentName() {
		return "Welcome to Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today�s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
