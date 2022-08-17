class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;     //Finding length of arrays
        int m = nums2.length;     //Finding length of arrays
        int i = 0;                //To avoid out of index error and for condition statement
        int j = 0;                //To avoid out of index error and for condition statement
        int count;                //to apply condition
        double m1 = -1, m2 = -1;  //To find median

        if ((m + n) % 2 == 1)   //execute if sum of array size is odd
        {
            for(count = 0; count <= (n + m) / 2; count++)   // To iterate in both arrays till count is                                                                  less than half of sum of both arrays
            {
                if (i != n && j != m)             //execute if i and j both are in range of there                                                               respective array size
                {
                    if(nums1[i] > nums2[j]) {              //comparing first element of both arrays  
                        m1 = nums2[j++];                   //set m1 to smaller element among both arrays
                    } else {
                        m1 = nums1[i++];
                    }
                  
                }
                else if (i < n)                  
                {
                    m1 = nums1[i++];          //iterate in num1 array and set m1 to index value
                }
                else
                {
                    m1 = nums2[j++];           //iterate in num2 array and set m1 to index value
                }
            }
            return m1;        // return median
        }
        else                          //if sum of arrays is even
        {
            for(count = 0; count <= (n + m) / 2; count++)
            {
                m2 = m1; 
                if (i != n && j != m)         //comparing first element of both arrays
                {
                    if(nums1[i] > nums2[j]) {     
                        m1 = nums2[j++];            //set m1 to smaller element among both arrays
                    } else {
                        m1 = nums1[i++];
                    }
                }
                else if (i < n)
                {
                    m1 = nums1[i++];
                }
                else
                {
                    m1 = nums2[j++];
                }
            }
            return (m1 + m2) / 2;        //return median
        }
    }
}