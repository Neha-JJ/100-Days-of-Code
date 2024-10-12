class Solution {
    public char repeatedCharacter(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;  
            
            if (count[c - 'a'] == 2) {
                return c;  
            }
        }
        
        return '\0';
    }
}