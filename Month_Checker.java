import java.util.*;

public class Month_Checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String name;
		String months[] = { "JANUARY", "FERBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER" };
		int days[] = { 31, 28, 31, 30, 31, 31, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter the Month to be searched");
		name = sc.nextLine();
		for (i = 0; i <months.length; i++) {
			if (name.equalsIgnoreCase(months[i])) {
				System.out.println("The month is present");
				System.out.println(months[i] + "\t" + days[i]);
			}
		}

	}

}
