package dsa;
import java.util.*;
public class assignment1_7 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number:");
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int count=0;
        int w=0;
        for(int i=10;n%i!=0;n=n/10)
        {
            int a=n%10;
            System.out.print(a);
            int b=count++;
            System.out.println(" Place Value "+(b+1));
            int d= (int)Math.pow(10,(a-1));
            int x=(count*d);
            w=w+x;
        }
        System.out.println("Your inverse of the given number is: "+w);
    }
    
}
