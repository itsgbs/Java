package basicprograms;

import java.util.Scanner;

public class whileprog {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer ... enter 0 for exit ");
        int n = sc.nextInt();
        int max=n;
        while(n!=0)
        {
            n = sc.nextInt();
            if(max<n)
                max = n;
        }
        System.out.println("the largest number = "+max);
    }
}
