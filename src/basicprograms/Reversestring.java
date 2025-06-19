package basicprograms;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String st = sc.next();
        String st1="";

        for(int i = st.length()-1 ;i>=0 ; i--)
        {
            st1 = st1 + st.charAt(i);
        }
        System.out.println("Reversed string = " + st1);
    }
}
