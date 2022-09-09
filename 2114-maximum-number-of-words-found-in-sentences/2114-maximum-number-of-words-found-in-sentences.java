class Solution {
    public int mostWordsFound(String[] sentences) {
//         int ans = 0;
        
//         for(int i = 0; i < sentences.length; i++) {
//             int count = 0;
//             for(int j = 0; j < sentences[i].length(); j++){
//                 if(sentences[i].charAt(j) == ' '){
//                     count++;
//                 }
//             }
            
//             if(count > ans) {
//                 ans = count;
//             }
//         }
        
//         return ans + 1;
        
        //same complexity
        int max = 1;
        for(int i = 0; i < sentences.length; i++){
            String[] arr = sentences[i].split(" ");
            max = Math.max(max,arr.length);
        }
        return max;
    }
}