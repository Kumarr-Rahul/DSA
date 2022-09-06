class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        int a = 0;
        int b = 1;
        int ans = 0;
        
        while(b < n) {
            
            if(nums[a] != nums[b]) {
                a++;
                //swap
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                
                b++;
                
            }else {
                b++;
            }
            
        }
        
        ans = a + 1;
        
        for(int i = ans; i < n; i++) {
            nums[i] = '_';
        }
        
        return ans;
    }
}