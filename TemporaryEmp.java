package Session5.Assignment3;

public class TemporaryEmp extends Employee {

	public TemporaryEmp(int empld, String EmpName, int total_leaves) {
		this.empld = empld;
		this.EmpName = EmpName;
		this.total_leaves = total_leaves;
	}

	int paid_leave = 2, sick_leave = 2, casual_leave = 5;
	double basic = 30000,hra= 7000,pfa = 700,total_salary = 100000;

	void print_leave_details() {
		System.out.println("You have total of " + paid_leave + " Paid leaves.");
		System.out.println("You have total of " + sick_leave + " Sick leaves.");
		System.out.println("You have total of " + casual_leave + " Casual leaves.");
	}
	@Override
	public void calculate_balance_leaves() {
		int x = 1;
		int y = 1;
		int z = 4;
		System.out.println("You have taken " + x + " Paid Leave.");
		System.out.println("You have taken " + y +  " Sick Leave.");
		System.out.println("You have taken " + z + " Casual Leave.");

	}
	
	@Override
	public boolean avail_leave(int no_of_leaves) {
		int a = paid_leave -1;
		int b = sick_leave -1;
		int c = casual_leave -4;
		System.out.println("You have total of " + a + " Paid Leaves Left.");
		System.out.println("You have total of " + b + " Sick Leaves Left.");
		System.out.println("You have total of " + c + " Casual Leaves Left.");
		return false;

	}
	@Override
	public void calculate_salary() {
		pfa = basic * .012;
		hra = basic * .5;
		total_salary = basic + hra - pfa;
		System.out.println("Your Total salary is " + total_salary);
	}
	void display() {
		empld = 9901;
		EmpName = "Rob";
		total_leaves = (paid_leave+ sick_leave +casual_leave);
				
		System.out.println("Hello " + EmpName + "! You are a temporaray employee and your Id is " + empld);
		
	}

}
