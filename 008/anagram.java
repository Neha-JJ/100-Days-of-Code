import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        // length check!!!!! how do you miss this, girl basicsssss
        if (a.length() != b.length()) {
            return false;
        }

        
        int[] frequency = new int[26]; 

       
        for (int i = 0; i < a.length(); i++) {
            frequency[a.charAt(i) - 'a']++;
            frequency[b.charAt(i) - 'a']--;
        }

        
        for (int count : frequency) {
            if (count != 0) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}