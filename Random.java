import java.util.*;
public class Random
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        char c;
        int n,i;
        System.out.println("The random characters are");
        for(i=1;i<=20;i++)
        {
            n=(int)(Math.random()*20);
            c=(char)(n+65);
            System.out.println(c);
        }
    }
}