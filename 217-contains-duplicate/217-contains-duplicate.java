class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        for(int i = 0 ; i  < nums.length - 1; i ++) {
            if(nums[i] == nums[i+1]) {
                count++;
            }
            if(count ==2) {
                return true;
            }
        }
        
        return false;
    }
}