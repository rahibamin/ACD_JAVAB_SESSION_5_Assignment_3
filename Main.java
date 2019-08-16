package Session5.Assignment3;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		String task = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to ABC Company");
		System.out.print("Are you a permamnent employee (perm) or temporaray (temp)?");
		task = sc.next();

		if (task.equalsIgnoreCase("perm")) {
			System.out.println();
			ParmanentEmp pm = new ParmanentEmp();
			pm.display();
			System.out.println();
			pm.calculate_salary();
			System.out.println();
			System.out.println("Your Leave Details as Permanent Emp");
			pm.print_leave_details();
			System.out.println();
			System.out.println("Your Leave Balance as Permanent Emp");
			pm.calculate_balance_leaves();
			System.out.println();
			System.out.println("Total Leaves Left");
			pm.avail_leave(0);

		}
		else if (task.equalsIgnoreCase("temp")) {
			System.out.println();
			TemporaryEmp tm = new TemporaryEmp(0, task, 0);
			tm.display();
			System.out.println();
			tm.calculate_salary();
			System.out.println();
			System.out.println("Your Leave Details as Temporary Emp");
			tm.print_leave_details();
			System.out.println();
			System.out.println("Your Leave Balance as Temporary Emp");
			tm.calculate_balance_leaves();
			System.out.println();
			System.out.println("Total Leaves Left");
			tm.avail_leave(0);
		}

	}

}
