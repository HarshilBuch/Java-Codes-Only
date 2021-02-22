import java.util.*;
public class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a,sum=0;
        int arr[]=new int[20];
        System.out.println("Enter 20 integers");
        for(a=0;a<20;a++)
        {
            arr[a]=sc.nextInt();
            if(arr[a]%3==0||arr[a]%5==0)
            {
                sum=sum+arr[a];
            }
        }
        System.out.println("The sum of all the numbers divisible by 3 or 5 is :"+sum);
    }
}