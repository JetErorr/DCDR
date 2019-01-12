import java.util.*;
import java.lang.*;

class entropy{
    public static void main (String []args) 
    {
        float sum=0;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter the number of elements: \n>");
        int n = var.nextInt();
        float p[]=new float[n];
        System.out.print("Enter the values of elements: \n>");
        for(int i=0;i<n;i++)
        {
            p[i]=var.nextFloat();
        }
        for(int i=0;i<n;i++)
        {
            sum = (p[i] *(float)Math.log(p[i])) + sum;
        }
        float h = -sum/(float)Math.log(2);
        System.out.println("The entropy is: "+h);
        var.close();
    }
}