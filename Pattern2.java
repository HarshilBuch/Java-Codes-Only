import java.util.*;
public class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j;
        for(i=65;i<=69;i++)
        {
            for(j=65;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print((char)(j+32));
                }
                else
                {
                    System.out.print((char)j);
                }
            }
            System.out.println();
        }
    }
}