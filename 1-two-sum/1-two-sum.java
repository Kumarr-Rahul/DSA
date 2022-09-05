class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                
                int val = nums[i] + nums[j];
                if(target == val) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        
        int[] ans = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}