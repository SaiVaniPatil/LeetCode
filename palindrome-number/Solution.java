class Solution {
    public boolean isPalindrome(int x) {
        
        String nubmber  = Integer.toString(x);
        
         StringBuilder input1 = new StringBuilder(nubmber).reverse();
        
        if(nubmber.equalsIgnoreCase(input1.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
       
        
    }
}