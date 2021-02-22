import java.util.*;
public class Compare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,max,min;
        int arr[]=new int[10];
        System.out.println("Enter 10 integers");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The greatest of the array elements ="+max);
        System.out.println("The smallest of the array elements ="+min);
    }
} 