class Solution {
    public int hammingDistance(int x, int y) 
    {
        
        int k = x^y;
        
        
       String binaryInt = Integer.toBinaryString(k);
        int count =0;
       
        for(int i=0;i<binaryInt.length();i++)
        {
            count =count+Character.getNumericValue(binaryInt.charAt(i));
        }
        
        return count;
    }
}