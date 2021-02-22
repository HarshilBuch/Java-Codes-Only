import java.util.*;
public class Marks
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j,c1=0,c2=0;
        int phy[]=new int[40];
        int chem[]=new int[40];
        int maths[]= new int[40];
        for(i=0;i<40;i++)
        {
            System.out.println("Enter the marks secured in physics");
            phy[i]=sc.nextInt();
            System.out.println("Enter the marks secured in chemistry");
            chem[i]=sc.nextInt();
            System.out.println("Enter  the marks secured in mathematics");
            maths[i]=sc.nextInt();
        }
        for(i=0;i<40;i++)
        {
            if(phy[i]+chem[i]+maths[i]/3.0>=80)
            {
                c1++;
            }
            if(phy[i]+chem[i]+maths[i]/3.0<=34)
            {
                c2++;
            }
        }
        System.out.println("Number of students who got more than or equal to 80 per cent are : "+c1++);
        System.out.println("Number of students who got less than or equal to 34 per cent are : "+c2++);
    }
}