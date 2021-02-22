import java.util.*;
public class Pattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j;
        char chr;
        for(i=65;i<=69;i++)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}