import java.util.*;

public class Salary {
	String name;
	String addr, subj;
	int salary, number;
	double income;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.nextLine();
		System.out.println("Enter the address");
		addr = sc.nextLine();
		System.out.println("Enter the subject specialization");
		subj = sc.nextLine();
		System.out.println("Enter your Monthly Salary");
		salary = sc.nextInt();

	}

	void calculate() {
		if (12 * salary > 175000) {
			income = ((salary * 12) - 175000) * 0.05;
		} else if (12 * salary < 175000)
			income = 0.0;

	}

	void display() {
		System.out.println("Name " + name);
		System.out.println("Address " + addr);
		System.out.println("Phone Number " + number);
		System.out.println("Subject Specialization " + subj);
		System.out.println("Monthly Salary " + salary);
		System.out.println("Income Tax " + income);

	}

	public static void main(String[] args) {
		Salary ob = new Salary();
		ob.accept();
		ob.calculate();
		ob.display();

	}

}
