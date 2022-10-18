class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        
        int len = 0;
        for(int val: nums){
            if(val == 1){
                len++;
            } else {
                res = Math.max(res, len);
                len = 0;
            }
        }
        
        res = Math.max(res, len);
        return res;
    }
}

