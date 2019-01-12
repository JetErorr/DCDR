//changes required
import java.io.*;
import java.util.Scanner;
class prefix{
    public static void main(String[] args) {
        int max = 4, flag = 0;
        String[] str = new String[max];
        System.out.println("Enter the table values: \n");
        System.out.println(">");
        Scanner var = new Scanner(System.in);
        for (int i = 0; i < max; i++) {
            str[i] = var.nextLine();
        }
        // System.out.println("You entered the values\n");
        // for (int i = 0; i < max; i++) {
        //     System.out.println(">> "+str[i]);
        // }
        for (int i = 0; i < max; i++) {
            for (int j = i+1; j < max; j++) {
                if(str[i].startsWith(str[j]))
                {flag = 1;}
            }
        }
        if(flag == 0){
            System.out.println("The entries are uniquely decodable.!");
        }
        if(flag == 1){System.out.println("Not a prefix table");}
    }
}