import java.util.Scanner;

public class Disarium {
	/*
	 * int n, sum, t,i;
	 * 
	 * Disarium() { n = 0; sum = 0; t = 0; i=0; }
	 * 
	 * public void accept() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter a number"); n = sc.nextInt(); t = n; }
	 * 
	 * void calculate() { while(n!=0) { ++i; n=n/10; sum=(int) (sum+(Math.pow(n,
	 * i)));
	 * 
	 * } } void display() { if(sum==t) {
	 * System.out.println("The number is a Disarium Number"); } else {
	 * System.out.println("The number is not a Disarium Number"); } }
	 */
	public static void main(String[] args) {
		int n, sum = 0, t = 0, i ;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		t = n;
		int rem;
		String s=Integer.toString(n);
		i=s.length();
		while (t > 0) {
			
			rem = t % 10;
			sum =  sum +(int) Math.pow(rem, i);
			i--;
			t=t/10;
		}

		if (sum == n) {
			System.out.println("The number is a Disarium Number");
		} else {
			System.out.println("The number is not a Disarium Number");
		}
		
		// TODO Auto-generated method stub

	}

}
