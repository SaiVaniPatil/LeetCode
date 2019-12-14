class Solution {
    public String reverseWords(String s) {
        
        String [] words = s.split("\\s+");
        
        String s1 ="";
        
        for(int i=0;i<words.length;i++)
        {
            s1= s1+ new StringBuilder(words[i]).reverse().toString()+" ";
        }
        
        return s1.trim();
        
    }
}