package functions;

import java.util.Scanner;

public class primeinterval {
    //print prime numbers between the given interval
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,i;
        System.out.println("Enter the two numbers ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.print("The prime numbers between " + m + " and " + n + " are " );
        for(i=m;i<=n;i++)
        {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        int i;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
