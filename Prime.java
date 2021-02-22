import java.util.*;
public class Prime
{
    int n;
    Prime()
    {
        n=0;
    }
    void input(int x)
    {
        n=x;
    }
    void display()
    {
        int i,c=0;
        for(i=0;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println("The number is a Prime Number");
        }
        else
        {
            System.out.println("The number is not a Prime Number");
        }
    }
}
