import java.util.Scanner;

public class Library {

	int accnum, day, fine;
	String title, author,a;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accession number");
		accnum = sc.nextInt();
		System.out.println("Enter the title of the book");
		a=sc.nextLine();
		title = sc.nextLine();
		System.out.println("Enter the author's name");
		author = sc.nextLine();

	}

	void compute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days after which the book is returned");
		day = sc.nextInt();
		fine = 2 * day;
		System.out.println("The Fine to be paid is Rupees." + fine);

	}

	void dispaly() {
		System.out.println("Accession Number "+accnum);
		System.out.println("Title "+title);
		System.out.println("Author "+author);

	}

	public static void main(String[] args) {
		Library ob=new Library();
		ob.input();
		ob.compute();
		ob.dispaly();

	}

}
