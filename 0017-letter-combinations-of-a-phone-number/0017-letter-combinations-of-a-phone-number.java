class Solution {
    
    int count = 0;
    
    private static final String[] KEYS = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
        
        count++;
       
        if(digits.equals("") == true) {
            ArrayList<String> base = new ArrayList<>();
            
            if(count == 1) {
                return base;
            } else 
                base.add("");
                return base;
            
        }
        
        List<String> smallans = letterCombinations(digits.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        
        for(Character letter : KEYS[digits.charAt(0) - '0' - 1].toCharArray()) {
            for(String str : smallans) {
                ans.add(letter + str);
            }
        }
        
        return ans;
    }
}