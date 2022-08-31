class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums. length - 1; i+= 3) {
            if(nums[i] != nums[i+1]) {
                ans = nums[i];
                return ans;
            }
        }
        
        return nums[nums.length - 1];
    }
}