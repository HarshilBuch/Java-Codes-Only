import java.util.*;
public class Change_Case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,h;
        char chr,c,n;
        System.out.println("Enter a Letter");
        chr=sc.next().charAt(0);
        if(Character.isLetter(chr))
            {
                if(Character.isUpperCase(chr))
                {
                    c=Character.toLowerCase(chr);
                    i=(int)c;
                    System.out.println("The changed case of "+chr+" is "+c+" and its ASCII code is "+i);
                }
                else
                {
                    n=Character.toUpperCase(chr);
                    h=(int)n;
                    System.out.println("The changed case of "+chr+" is "+n+" and its ASCII code is "+h);
                }
            }
            else
            {
                System.out.println("The inputted character should be a letter");
            }
        }
    }