class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() ==0)
        {
            return 0;
        } 
        
        String[] sArray = s.split(" ");
        if(sArray.length==0)
        {
            return 0;
        }
        
        return sArray[sArray.length-1].length();
        
    }
}