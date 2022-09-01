class Solution {
    public void moveZeroes(int[] nums) {
        int lidx = nums.length - 1;
        for(int i = lidx; i >= 0; i--) {
            if(nums[i] == 0){
                
                int idx = i;
                while(idx < nums.length - 1 && nums[idx + 1] != 0) {
                    int temp = nums[idx];
                    nums[idx] = nums[idx + 1];
                    nums[idx + 1] = temp;
                    
                    idx++;
                }
            }
        }
    }
}