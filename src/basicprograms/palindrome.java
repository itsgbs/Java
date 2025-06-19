package basicprograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase
        String lowerCaseInput = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(lowerCaseInput).reverse().toString();

        // Check if input equals reversed
        if (lowerCaseInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

//        new StringBuilder(lowerCaseInput)
//        This creates a new StringBuilder object and initializes it with the contents of lowerCaseInput.
//
//                StringBuilder is a mutable sequence of characters, which means you can change it (unlike String which is immutable).
//
//        2. .reverse()
//        This is a built-in method of StringBuilder that reverses the sequence of characters.
//
//                Example: If lowerCaseInput is "madam", after .reverse() it becomes "madam" (same, because it's a palindrome).
//
//        If it were "hello", it would become "olleh".
//
//        3. .toString()
//        This converts the reversed StringBuilder object back into a regular String.
//
//                StringBuilder and String are different types, and .toString() is used to get the final reversed string in String form.
    }
}
