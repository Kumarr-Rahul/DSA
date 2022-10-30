//Greddy Approach

class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        int curr = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(i > reach) {
                return false;
            }
            
            curr = i + nums[i];
            
            if(curr > reach) {
                reach = curr;
            }
            
        }
        
        return true;
    }
}