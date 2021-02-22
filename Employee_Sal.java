import java.util.*;
public class Employee_Sal 
{
    int basic ;
    String name,empno;
    double da,hra,pf,gross,net;
    Employee_Sal(String n,String en,int basics)
    {
        name=n;
        empno=en;
        basic=basics;
    }
    void compute()
    {
        da=basic*0.3;
        hra=basic*0.15;
        pf=basic*1.2;
        gross=basic+da+hra;
        net=gross-pf;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Employee Number : "+empno);
        System.out.println("Enter Basic Salary: "+basic);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int basicp;
        String nm,emp;
        System.out.println("Enter Employee's name,Number and Basic Pay: ");
        nm=sc.nextLine();
        emp=sc.nextLine();
        basicp=sc.nextInt();
        Employee_Sal ob= new Employee_Sal(nm,emp,basicp);
        ob.compute();
        ob.display();
    }
}