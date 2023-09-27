package dsa;
import java.util.*;
public class assignment1_4 
{
    public static void main(String[] args)
    {
        System.out.println("Enter lower range:");
        Scanner z=new Scanner(System.in);
        int n1=z.nextInt();
        System.out.println("Enter upper range:");
        int n2=z.nextInt();
        for(int i=n1;i<=n2;i++)
        {
             int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
           if(count==2)
                    {
                        System.out.println(i+" is prime");
                    } 
        }
    }
}
