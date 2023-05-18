import java.util.*;
class Assignment1
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int a=M%3;
        int b=M%5;
        if (a==0 && b==0)
        {
            System.out.println("Good Number");
        }
        else if(a==0 && b!=0)
        {
            System.out.println("Bad Number");
        }
        else if(a!=0 && b==0)
        {
            System.out.println("Poor Number");
        }
        else
        {
          System.out.println("-1");  
        }
    }
}
