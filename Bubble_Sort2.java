import java.util.*;
public class Bubble_Sort2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int temp,i,j;
        int arr[]=new int[10];
        System.out.println("Enter 10 integers ");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The number arranged in ascending order are");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
            }
        }            