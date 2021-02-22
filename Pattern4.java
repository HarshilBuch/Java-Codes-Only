import java.util.*;
public class Pattern4
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j;
        for(i=69;i>=65;i-=2)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}