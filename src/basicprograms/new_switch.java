package basicprograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class new_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        press alt + enter to get enhanced switch
  switch (n) {
     case 1 -> System.out.println("1");
     case 2 -> System.out.println("2");
     default -> System.out.println("nothing");
 }
*/


        System.out.println("Enter the day number ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
