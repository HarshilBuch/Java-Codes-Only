import java.util.*;
public class Check_Case
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean p;
        boolean m;
        char chr;
        System.out.println("Enter a character : ");
        chr=sc.next().charAt(0);
        if(Character.isLetter(chr))
        {
            if(Character.isUpperCase(chr))
            {
                System.out.println("The Character is an Upper Case Letter");
            }
            else
            {
                System.out.println("The Character is a Lower Case Letter");
            }
        }
        else
        {
            if(Character.isDigit(chr))
            {
                System.out.println("The Character is a Digit");
            }
            else
            {
                System.out.println("The Character is a Special Character");
            }
        }
    }
}