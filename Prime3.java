import java.util.*;

public class Prime3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int i, j;
		System.out.println("Enter 20 integers");
		for (i = 0; i < 20; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Prime Numbers are ");
		for(i=0;i<20;i++) {
			if(arr[i]==1) {
				continue;
			}
			boolean isPrime=true;
			for(j=2;j<arr[i]/2;j++) {
				if(arr[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(arr[i]+",");
			}
		}
	    
		// TODO Auto-generated method stub

	}

}
