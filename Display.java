import java.util.*;
public class Display
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        char chr;
        int n,a=0,b=0;
        System.out.println("Enter the number of characters you want to enter");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            chr=sc.next().charAt(0);
            if(Character.isUpperCase(chr))
            {
                a++;
            }
            else
            {
                b++;
            }
        }
        System.out.println("The number of Upper Case Characters are "+a);
        System.out.println("The number of Lower Case Characters are "+b);
    }
}