// public class Solution {
//     // you need treat n as an unsigned value
//     public int reverseBits(int n) {
//         if (n == 0) return 0;
//         int revrs = 0;
//         for (int i = 0; i < 32; i++) {
//             revrs <<= 1;
//             if ((n & 1) == 1) revrs++;
//             n >>= 1;
//         }
//         return revrs;
//     }
// }

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n == 0) return 0;
        
        boolean flag = false;
        int rev = 0;
        int j = 0;
        
        for(int i = 31; i >= 0; i--) {
           int mask = (1 << i); //left shifting my i times
            
            if((n & mask) != 0) {
                    int smask = (1 << j);
                    rev |= smask; 
                    j++;
            } else {
                j++; 
            }
                
                 
        }
        
        return rev;
    }
}