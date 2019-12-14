class Solution {
    public int[] numberOfLines(int[] widths, String S)
    {
        int sum =0;
        int lines =1;
        if(S.length()==0)
        {
            lines =0;
        }
        for(char c : S.toCharArray())
        {
            sum = sum+widths[c-'a'];
            
            if(sum>100)
            {
                lines++;
                sum = widths[c-'a'];
            }
        }
        
        
        int [] A = {lines,sum};
        
        return A;
        
    }
}