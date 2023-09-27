package dsa;
import java.util.*;
public class assignment1_2
 {
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        System.out.println("Enter your grade:");
        int q=z.nextInt();
        if(q>90)
        {
            System.out.println("Excellent");
        }
        else if(q>80)
        {
            System.out.println("good");
        }
        else if(q>70)
        {
            System.out.println("fair");
        }
        else if(60<q)
        {
            System.out.println("meets expectations");
        }
        else
        {
            System.out.println("below par");
        }
    }

    
}
