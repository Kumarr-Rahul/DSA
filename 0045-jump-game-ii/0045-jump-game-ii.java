class Solution {
    public int jump(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        
        int ans = 0;
        
        int idx = 0;
        while(idx < nums.length){
            if(idx + nums[idx] >= nums.length - 1){
                ans++;
                break;
            }
            
            int j = idx;
            for(int i = idx + 1; i <= idx + nums[idx] && i < nums.length; i++){
                if(i + nums[i] > j + nums[j]){
                    j = i;
                }
            }
            
            idx = j;
            ans++;
        }
        
        return ans;
    }
}

//2nd Approach
// class Solution {
//     public int jump(int[] nums) {
//         if(nums.length <= 1){
//             return 0;
//         }
        
//         int ans = 0;
        
//         int curr = 0;
//         int prev = 0;
//         while(curr < nums.length){
//             if(curr + nums[curr] >= nums.length - 1){
//                 ans++;
//                 break;
//             }
            
//             int inter = curr;
//             for(int j = prev + 1; j <= curr + nums[curr] && j < nums.length; j++){
//                 if(j + nums[j] >= inter + nums[inter]){
//                     inter = j;
//                 }
//             }
            
//             prev = curr + nums[curr];
//             curr = inter;
//             ans++;
//         }
        
        
//         return ans;
//     }
// }