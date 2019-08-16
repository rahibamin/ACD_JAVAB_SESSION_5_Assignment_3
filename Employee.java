package Session5.Assignment3;

public abstract class Employee {

	int empld;
	String EmpName;
	int total_leaves;
	double total_salary;
	
	
	abstract void calculate_balance_leaves();
	abstract boolean avail_leave(int no_of_leaves);
	abstract void calculate_salary();

}
