import java.util.*;
public class Pattern5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j;
        for(i=69;i>=65;i--)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j+"*");
            }
            System.out.println();
        }
    }
}