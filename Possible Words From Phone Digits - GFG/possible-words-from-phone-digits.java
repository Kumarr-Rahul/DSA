//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static final String[] KEYS = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" }; 
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        
        if(N == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> smallans = possibleWords(a, N - 1);
        ArrayList<String> ans = new ArrayList<>();
        
        //Array length - N = required index value of Array, e.g. when N = 3, we need first element of array
        //when N = 1, we need last element
        
        String str = KEYS[ a[a.length - N] - 1]; 
        
        for(char letter : str.toCharArray() ) {
            for(String ch : smallans) {
                ans.add(letter + ch);
            }
        }
        
        return ans;
    }
}


