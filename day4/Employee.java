package day4;

public class Employee {
	private int employee_id;
	private String employee_name;
	private double employee_salary;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
		if (employee_id == 1) {
            this.employee_salary = 7000.0;
        } else if (employee_id == 2) {
            this.employee_salary = 10000.0;
        } else {
            this.employee_salary = 5000.0;
        }
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}
	
	
}
