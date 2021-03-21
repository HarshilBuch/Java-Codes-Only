import java.util.*;

public class Caseconvert {

	String str, str1="";
	char c, d;
	int i;

	void getstr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();

	}

	void convert() {
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				d = Character.toUpperCase(c);
				str1 =  str1 + d;
			} else if (c >= 'A' && c <= 'Z') {
				d = Character.toLowerCase(c);
				str1 += d;
			}
		}
	}

	void display() {
		System.out.println("Converted String " + str1);
	}

	public static void main(String[] args) {

		Caseconvert ob = new Caseconvert();
		ob.getstr();
		ob.convert();
		ob.display();

	}

}
