// changes required
import java.util.*;
import java.lang.*;

class entropy0{
    // static final int MAX_CHAR = 256;
    public static void main (String []args)
    {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word \n>");
        String word = sc.nextLine();
        int n = word.length();
        float p[] = new float[n];
        char ch[] = new char[n];
        int count[] = new int[5];
        for (int i = 0; i < n; i++)
            {
                count[word.charAt(i)]++;
            }
        for (int i = 0; i < n; i++)
        {
            ch[i] = word.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++)
            { 
                if (word.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
            System.out.println("Occurrence of " + word.charAt(i) + " = " + count[word.charAt(i)]); 
            p[i]=(float)count[word.charAt(i)]/(float)n;
           // System.out.println(p[i]);
        } 
        for(int i=0;i<n;i++)
        {
            sum = (p[i] *(float)Math.log(p[i])) + sum;
        }
        float h = - sum/(float)Math.log(2);
        System.out.println("The entropy is" + h);
        sc.close();
    }
}