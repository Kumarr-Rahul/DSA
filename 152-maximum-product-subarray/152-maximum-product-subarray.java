// class Solution {
//     public int maxProduct(int[] nums) {
//         int res = Integer.MIN_VALUE;
        
//         int prd = 1;
//         for(int i = 0; i < nums.length; i++){
//             prd = prd * nums[i];
//             if(prd > res){
//                 res = prd;
//             }
            
//             if(prd == 0){
//                 prd = 1;
//             }
//         }
        
//         prd = 1;
//         for(int i = nums.length - 1; i >= 0; i--){
//             prd = prd * nums[i];
//             if(prd > res){
//                 res = prd;
//             }
            
//             if(prd == 0){
//                 prd = 1;
//             }
//         }
        
//         return res;
//     }
// }

//2nd Approach
class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                max = Math.max(max * nums[i], nums[i]);
                min = Math.min(min * nums[i], nums[i]);
            } else {
                int temp = max;
                max = Math.max(min * nums[i], nums[i]);
                min = Math.min(temp * nums[i], nums[i]);
            }
            
            res = Math.max(res, max);
        }
        
        return res;
    }
}