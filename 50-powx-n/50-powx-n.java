class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0) {
            return 1;
        }
        
        
        if(n<0){
            double subans = myPow(1/x, -(n + 1));
            return 1/x * subans;
        }
        

        double pow = myPow(x, n/2);
        double ans = pow * pow;
    
        
        if(n%2 == 1) {
            return ans * x;
        }
        
        return ans;
        
    }
}