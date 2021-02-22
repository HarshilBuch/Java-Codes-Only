public class Pattern
{
    int i;
    char chr;
    Pattern()
    {
        i=0;
    }
    void display()
    {
        for(i=65;i<=90;i++)
        {
            chr=(char)i;
            System.out.println(chr +"\t"+i);
        }
    }
}