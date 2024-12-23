class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            mid = (left+right) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}