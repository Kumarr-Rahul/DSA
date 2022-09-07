class Solution {
    public List<String> fizzBuzz(int n) {
       
        
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            //if(n == 0 && i == 0) return null;
            if((i+1) % 3 == 0 && (i+1) % 5 != 0)  list.add("Fizz");
            else if((i+1) % 5 == 0 && (i+1) % 3 != 0) list.add("Buzz");
            else if((i+1) % 15 == 0 ) list.add("FizzBuzz"); 
            else list.add(String.valueOf((i+1)));
                
                
        }
        return list;
    }
}