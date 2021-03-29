import java.util.Scanner;

public class Bubble_Sort3 {

	static int[] input() {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int i, j;
		System.out.println("Enter 10 integers");
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	static void cal(int[] a) {
		int i, j, temp =999;

		for (i = 0; i < 9; i++) {
			for (j = 0; j < (9-i); j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					if (a[j+1] == 0 || a[j] ==0) {
						System.out.println(j);
					}
				}
			}
		}
		System.out.println("The new array is");
		for (i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		Bubble_Sort3 ob = new Bubble_Sort3();
		// int array[]=ob.input();
		int array[] = input();
		ob.cal(array);
		// TODO Auto-generated method stub

	}

}
