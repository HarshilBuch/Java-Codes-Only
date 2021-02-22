import java.util.*;
public class Custom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,a=0,b=0,multi=0;
        int arr[]=new int[20];
        System.out.println("Enter 20 integers ");
        for(i=0;i<20;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
            if(arr[i]%2==0)
            {
                a++;
            }
            if(arr[i]%2!=0)
            {
                b++;
            }
            if(arr[i]%4==0)
            {
                multi++;
            }
        }
        System.out.println("The number of even integers are "+a);
        System.out.println("The number of odd integers are "+b);
        System.out.println("The number of integers which can be multiplied by 4 are " +multi);
    }
}