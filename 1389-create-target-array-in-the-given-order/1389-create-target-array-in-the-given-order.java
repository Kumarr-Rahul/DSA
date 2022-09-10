// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         int[]target = new int[nums.length];
        
//         int idx = 0;
        
//         while(idx < nums.length) {
//             for(int i = nums.length - 1; i > index[idx]; i--){
//                 target[i] = target[i-1];
//             }
//             target[index[idx]] = nums[idx];
//             idx++;
//         }
        
//         return target;
//     }
// }

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        int[]target = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        
        return target;
    }
}