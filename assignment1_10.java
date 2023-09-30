package dsa;
import java.util.*;
public class assignment1_10 
{
    public static void main(String[]args)
    {
        System.out.println("Enter number: ");
        Scanner z=new Scanner(System.in);
        int n1=z.nextInt();
        System.out.println("The prime factors of "+n1+" are: ");
        for(int i=2;i<=n1;i++)
        {
            while(n1%i==0)
            {
               n1=n1/i;
               System.out.println(i);
            }
        }

    }
    
}
