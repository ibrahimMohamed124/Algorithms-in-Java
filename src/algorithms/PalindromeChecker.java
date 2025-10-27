package algorithms;

public class PalindromeChecker {

    // Use String Builder to check if a word is palindrome
    public static boolean isPalindrome(String str) {
        // Create a StringBuilder object with the input string
        StringBuilder reversedStrBuilder = new StringBuilder(str);

        // Reverse the StringBuilder
        reversedStrBuilder.reverse();

        // Convert the reversed StringBuilder back to a String
        String reversedStr = reversedStrBuilder.toString();

        // Compare the original string with the reversed string
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";
        String test3 = "racecar";

        System.out.println(test1 + " is a palindrome: " + isPalindrome(test1)); // true
        System.out.println(test2 + " is a palindrome: " + isPalindrome(test2)); // false
        System.out.println(test3 + " is a palindrome: " + isPalindrome(test3)); // true
    }
}