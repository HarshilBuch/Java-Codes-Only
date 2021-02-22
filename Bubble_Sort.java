/*a[] = 1,67,98,5, 0
      0 1  2  3   4 
for i = 0 to n
 for j = i+1 to n
  if a[i] > a[j]
    temp = a[i]
    a[i] = a[j]
   a[j] = temp*/
import java.util.*;
public class Bubble_Sort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int num,i,j,temp;
        System.out.println("Enter the number of integers to sort:");
        num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter " + num + " integers: ");
        for (i=0;i<num;i++) 
        a[i] =sc.nextInt();
 
        for (i=0;i<(num-1);i++) 
          {
             for (j=0;j<num-i-1;j++) 
               {
                  if (a[j]>a[j+1]) 
                    {
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                    }
               }
          }
 
        System.out.println("Sorted list of integers:");
 
        for (i=0;i<num;i++) 
        System.out.println(a[i]);
  }
}