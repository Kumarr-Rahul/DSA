class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = nums.length;
        
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                idx = i;
                break;
            }
            
            if(target < nums[i]) {
                idx = i;
                break;
            }
        }
        
        return idx;
  }
}