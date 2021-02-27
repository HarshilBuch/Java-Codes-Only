import java.util.*;
public class Series1
{
    int sum(int n)
    {
        int i,j,sum=0;
        for(i=0;i<n;i++)
        {
           sum=sum+(i*(i+1));
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,a;
        System.out.println("Enter the range");
        a=sc.nextInt();
        Series1 ob=new Series1();
        k=ob.sum(a);
        System.out.println("The sum of the series is "+k);
    }
}