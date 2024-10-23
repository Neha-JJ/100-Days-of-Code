class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // i will keep track of the index of the last unique element found.
        int i = 0;

        
        for (int j = 1; j < nums.length; j++) {
            
            if (nums[j] != nums[i]) {
                i++; 
                nums[i] = nums[j]; // Update nums[i] 
            }
        }

        // Return the number of unique elements.
        // Since i is the index of the last unique element, the number of unique elements is i + 1.
        return i + 1;
    }
}