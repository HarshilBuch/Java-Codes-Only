import java.util.*;
public class Perfect_Buzz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int sum=0,i,j,n;
        int arr[]=new int[20];
        System.out.println("Enter 20 integers");
        for(i=0;i<20;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Press 1 to check the number of perfect numbers");
        System.out.println("Press 2 to check the number of buzz numbers");
        n=sc.nextInt();
        switch(n)
        {
            case 1: for(i=0;i<20;i++)
            {
                for(j=1;j<arr[i];j++)
                {
                    if(arr[i]%j==0)
                    {
                        sum=sum+j;
                    }
                }
                if(sum==arr[i])
                {
                    System.out.println(arr[i]);
                }
            }
                break;
                case 2: for(i=0;i<20;i++)
                {
                    if(arr[i]%7==0||arr[i]%10==7)
                    {
                        System.out.println(arr[i]);
                    }
                }
                break;
                default : System.out.println("Invalid choice");
            }
        }
    }