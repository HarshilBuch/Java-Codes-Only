import java.util.*;
public class Repeat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i,j,k,count=0,count2=0,num;
        System.out.println("Enter the number of integers to be entered");
        num=sc.nextInt();
        System.out.println("Enter the integers");
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}