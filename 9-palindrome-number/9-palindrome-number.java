class Solution {
    public boolean isPalindrome(int x) {
        
        int res = 0;
        for(int i = x; i > 0; i /= 10){
            res = res * 10 + (i % 10);
        }
        
        if(res == x) {
            return true;
        }else {
            return false;
        }
    }
}