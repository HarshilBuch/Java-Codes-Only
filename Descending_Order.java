import java.util.*;
public class Descending_Order
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,temp=0,j;
        int arr[]=new int[40];
        int arr2[]=new int[40];
        System.out.println("Enter the roll numbers and the marks");
        for(i=0;i<40;i++)
        {
            arr[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        for(i=0;i<39;i++)
          {
             for(j=0;j<(39-i);j++)
              {
                  if(arr2[j]<arr[j+1])
                  {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        temp=arr2[j];
                        arr2[j]=arr2[j+1];
                        arr2[j+1]=temp;
                  }
               }
          }
        System.out.println("Roll No."+"\t"+"Marks");
        for(i=0;i<40;i++)
         {
            System.out.println(arr[i]+"\t"+arr2[i]);
         }
        }
    }