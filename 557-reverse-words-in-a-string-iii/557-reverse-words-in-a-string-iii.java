class Solution {
    public static void swap(char[] ch, int a, int b) {
        
        while(a<b) {
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;
            a++;
            b--;
        }
    }
    
    public String reverseWords(String s) {
        
        char [] ch = s.toCharArray();
        int initial = 0;
        int count = -1; //to find index before space
        
        for(int i = 0; i < s.length(); i ++) {
            
            if(ch[i] != ' ') {
                count++;
            }else {
                swap(ch, initial, count);
                count++;
                initial = i + 1;
            }
        }
        
        swap(ch, initial, s.length() - 1); // for last words as ch[i] != ' ' will not hit for last word
        
        return s.valueOf(ch);
        
    }
}