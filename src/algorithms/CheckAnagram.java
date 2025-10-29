package algorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2){
        // Define New ArrayLists
        List<Character> str1_list = new ArrayList<>();
        List<Character> str2_list = new ArrayList<>();

        // Convert Strings To ArrayList
        for (char c : str1.toCharArray()) {
            str1_list.add(c);
        }

        for (char c : str2.toCharArray()) {
            str2_list.add(c);
        }

        // Sort Two ArraysLists
        Collections.sort(str1_list);
        Collections.sort(str2_list);

        // Compare Btw Them To Check if Two Strings Are Anagram
        if (str1_list.equals(str2_list)) return true;
        else return false;

    }

    public static void main(String[] args){
        boolean res = isAnagram("abc","cba");
        if (res) System.out.println("Two Strings Are Anagram");
        else System.out.println("Two Strings Are Not Anagram");
    }
}
