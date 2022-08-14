class Solution {
    public String shortestPalindrome(String str) {
        
        String s1 = str + "$" + new StringBuilder(str).reverse().toString();
    
        int[] lps = new int[s1.length()];
        int len = 0;
        int i = 1;
        while(i < lps.length){
            
            if(s1.charAt(i) == s1.charAt(len)){
                lps[i] = len + 1;
                len++;
                i++;
                
            } else if(len > 0){
                len = lps[len - 1];
                
            } else {
                lps[i] = 0;
                len = 0;
                i++;
            }
        }

            int ppl = lps[lps.length - 1];
            String right = str.substring(ppl);
            return new StringBuilder(right).reverse().toString() + str;
        }
}