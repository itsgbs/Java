package functions;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    static void max(int a,int b,int c)
    {
        int max;
        max = (a > b) ? (Math.max(a, c)) : Math.max(b, c);
        System.out.println("The maximum is " + max);
    }
    static void min(int a,int b,int c)
    {
        int min;
        min = (a < b) ? (Math.min(a, c)) : Math.min(b, c);
        System.out.println("The minimum is " + min);
    }
}
