import java.util.*;
public class Next10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,n=0;
        char chr,v;
        System.out.println("Input a Character");
        chr=sc.next().charAt(0);
        i=(int)chr;
        n=i+10;
        v=(char)n;
        System.out.println("The 10th character after "+chr+" is "+v);
    }
}