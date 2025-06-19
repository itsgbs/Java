package basicprograms;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //below program is for nth term of fibo
//        System.out.print("Enter the nth term of basicprograms.fibonacci series : ");
//        int n = sc.nextInt();
//        int i,a=0,b=1,c;
//        for(i=1;i<n;i++)
//        {
//            c = a+b;
//            a=b;
//            b=c;
//        }
//        System.out.println(a);

        //below is for series
        System.out.print("Enter the nth term of basicprograms.fibonacci series : ");
        int n = sc.nextInt();
        int i,a=0,b=1,c;
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }

    }

}
