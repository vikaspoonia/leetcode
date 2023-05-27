import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        int count = 0;

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        if(s.length() !=t.length()){
            return false;
        }
        for( int i = 0; i < s.length(); i++){

            if(hm.containsKey(s.charAt(i))){

               count =hm.get(s.charAt(i));
               hm.put(s.charAt(i), count+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i <t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                count=hm.get(t.charAt(i));
                if(count==1){
                    hm.remove(t.charAt(i));
                }
                else{
                    count--;
                    hm.replace(t.charAt(i), count);
                }
                count = 0;
                
            }
            
        }
        
        if(hm.size()>0){
            return false;
        }
        return true;
        
        
    }
}
