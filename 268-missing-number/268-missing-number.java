class Solution {
    
    public static int arraySum(int[] arr2) {
        int sum = 0;
        for(int i = 0; i< arr2.length; i++) {
            sum += arr2[i];
        }
        
        return sum;
    }
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = n * (n + 1)/2;
        
        int m = s - arraySum(nums);
        
        return m;
    }
}