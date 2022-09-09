class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        
        for(int i = 0,j = 0; i < n; i++) {

            ans[j] = nums[i];
            j++;
            ans[j] = nums[i + n];
            j++;
        }
        
        return ans;
    }
}