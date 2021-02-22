import java.util.*;
public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=85;i<=90;i++)
        {
            for(j=90;j>=i;j--)
            {
                System.out.print((char)j);
            }
             System.out.println();
            }
        }
    }
   