import java.util.*;
public class Palindrome
{
    int reverse(int n)
    {
        int rem,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return (rev);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,c,a;
        System.out.println("Enter the number ");
        a=sc.nextInt();
        c=a;
        Palindrome ob=new Palindrome();
        k=ob.reverse(a);
        if(k==c)
        {
            System.out.println("The number is a Palindrome Number");
        }
        else
        {
            System.out.println("The number is not a Plaindrome Number");
        }
    }
    }