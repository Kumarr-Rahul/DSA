class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type")) {
                String type = items.get(i).get(0);
                if(ruleValue.equals(type)) {
                    count++;
                }
                
            }else if(ruleKey.equals("color")) {
                String color = items.get(i).get(1);
                if(ruleValue.equals(color)) {
                    count++;
                }
                
            }else {
                String name = items.get(i).get(2);
                if(ruleValue.equals(name)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}