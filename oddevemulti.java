import java.util.*;

class oddevemulti{
    public static void even(int[] arr)
    {
        int count=0;
        for(int i =0;i<20;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }  
        System.out.println("The number of even numbers is : "+count);
    }
    public static void odd(int[] arr)
    {
        int count=0;
        for(int i =0;i<20;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }  
        System.out.println("The number of odd numbers is : "+count);
    }
    public static void multiple(int[] arr)
    {
        int count=0;
        for(int i =0;i<20;i++)
        {
            if(arr[i]%4==0)
            {
                count++;
            }
        }  
        System.out.println("The number of multiples of 4 are : "+count);
    }
    public static void insert()
    {
        int arr[] =new int[20];
        Scanner sc=new Scanner(System.in);
        
        for(int i =0;i<20;i++)
        {
            arr[i]=sc.nextInt();
        }
        even(arr)       ;
        odd(arr);
        multiple(arr);
    }
    public static void main (String args[])
    {
        System.out.println("Enter array of 20 integers");
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[20];
        insert();
        
    }
}
    