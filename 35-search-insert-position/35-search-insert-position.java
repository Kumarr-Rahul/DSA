class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        int put = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                idx = i;
                flag = true;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(target < nums[i]) {
                put = i;
                break;
            }else {
                put = nums.length;
            }
        }
        
        if(flag) {
           return idx; 
        }else {
            return put;
        }
        
    }
}