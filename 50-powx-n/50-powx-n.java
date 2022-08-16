class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0) {
            return 1;
        }
        
        
        if(n<0){
            return 1/x * myPow(1/x, -(n + 1));
        }
        

        double pow = myPow(x, n/2);
        double ans = pow * pow;
    
        
        if(n%2 == 1) {
            return ans * x;
        }
        
        return ans;
        
    }
}