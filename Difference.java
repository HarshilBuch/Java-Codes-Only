import java.util.*;
public class Difference
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,n,d;
        char chr,chr2;
        System.out.println("Enter two characters");
        chr=sc.next().charAt(0);
        chr2=sc.next().charAt(0);
        i=(int)chr;
        n=(int)chr2;
        d=i-n;
        if(d==0)
        {
            System.out.println("Both Characters are same");
        }
        else if(d<0)
        {
            System.out.println("First Character is smaller");
        }
        else if(d>0)
        {
            System.out.println("First Character is grearter");
        }
    }
}