import java.util.*;
public class Linear_Search
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        int i,k=0,ns;
        int arr[]=new int[10];
        System.out.println("Enter the numbers in the cell");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched :-");
        ns=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==ns)
            {
                k=1;
            }
        }
        if(k==1)
        {
            System.out.println("The number is present ");
        }
        else
        {
            System.out.println("The number is not present ");
        }
    }
}