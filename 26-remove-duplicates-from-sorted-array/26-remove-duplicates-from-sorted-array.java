// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n = nums.length;
        
//         int a = 0;
//         int b = 1;
//         int ans = 0;
        
//         while(b < n) {
            
//             if(nums[a] != nums[b]) {
//                 a++;
//                 //swap
//                 int temp = nums[a];
//                 nums[a] = nums[b];
//                 nums[b] = temp;
                
//                 b++;
                
//             }else {
//                 b++;
//             }
            
//         }
        
//         ans = a + 1;
        
//         //not required
//         // for(int i = ans; i < n; i++) {
//         //     nums[i] = '_';
//         // }
        
//         return ans;
//     }
// }

//Approach 2
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n;

        int i = 1;
        for (int j = i; j < n; j++)
            if (nums[j] != nums[i - 1])
                nums[i++] = nums[j];

        return i;
    }
}