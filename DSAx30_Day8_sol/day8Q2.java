package DSAx30_Day8_sol;
import java.util.Scanner;
public class day8Q2 {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter string first: ");
        String s1 = a.nextLine().trim();
        System.out.print("enter string second: ");
        String s2 = a.nextLine().trim();
        if (areAnagrams(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        a.close();
    }
}
