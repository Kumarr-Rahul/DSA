// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int[]res = new int[nums.length - k + 1];
//         int idx = 0;
        
//         Deque<Integer> q = new ArrayDeque<>();
//         for(int i = 0; i < nums.length; i++) {
            
//             if(q.size() > 0 && q.getFirst() <= i - k) {
//                 q.removeFirst();
//             }
            
//             while(q.size() > 0 && nums[q.getLast()] < nums[i]) {
//                 q.removeLast();
//             }
            
//             q.addLast(i);
            
//             if(i >= k - 1){
//                 res[idx++] = nums[q.getFirst()];
//            }
//         }
        
//         return res;
//     }
// }

//2nd Approach
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        
        st.push(nums.length - 1);
        nge[nums.length - 1] = nums.length;
        
        for(int i = nums.length - 2; i >= 0; i--){
            int val = nums[i];
            while(st.size() > 0 && val >= nums[st.peek()]){
                st.pop();
            }
            
            if(st.size() == 0){
                nge[i] = nums.length;
            } else {
                nge[i] = st.peek();
            }
            
            st.push(i);
        }
        
        
        int[] res = new int[nums.length - k + 1];
        int j = 0;
        for(int i = 0; i < res.length; i++){
            if(j < i){
                j = i;
            }
            
            while(nge[j] <= i + k - 1){
                j = nge[j];
            }
            
            res[i] = nums[j];
        }
     
        return res;
    }
}