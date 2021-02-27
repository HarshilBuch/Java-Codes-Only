import java.util.*;
public class Prime2
{
    int check(int n)
    {
        int count=0,i,f=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            f=1;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a,k;
        System.out.println("Enter a number");
        a=sc.nextInt();
        Prime2 ob=new Prime2();
        k=ob.check(a);
        if(k==1)
        {
            System.out.println("The number is a Prime number ");
        }
        else
        {
            System.out.println("The number is not a Prime Number");
        }
    }
}