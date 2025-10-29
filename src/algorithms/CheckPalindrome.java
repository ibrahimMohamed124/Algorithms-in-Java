package algorithms;

import java.util.Locale;

public class CheckPalindrome {

    static boolean isPalindrome(String str){
        str = str.toLowerCase(Locale.ROOT);
        int length = str.length();
        for (int i =0;i<str.length() / 2;i++){
            if (str.charAt(i) != str.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));   // true
        System.out.println(isPalindrome("Racecar")); // true
        System.out.println(isPalindrome("java"));    // false
        System.out.println(isPalindrome("level"));
    }
}
