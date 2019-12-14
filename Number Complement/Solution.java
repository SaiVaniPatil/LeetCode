class Solution {
    public int findComplement(int num) {
        
        String binaryString = Integer.toBinaryString(num);
        
        boolean ignore =true;
        String output="";
        for(char c : binaryString.toCharArray())
        {
            if(c=='1')
            {
                output =output+0;
                ignore =false;
            }
            if(c=='0'&&!ignore)
            {
               output =output+1;
            }
        }
        return Integer.parseInt(output, 2);
        
    }
}