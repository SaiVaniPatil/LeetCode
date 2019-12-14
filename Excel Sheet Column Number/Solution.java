class Solution {
    public int titleToNumber(String s) 
    {
        int strLength = s.length();
        if(strLength==0)
        {
            return 0;
        }
        int ans =(int)s.charAt(strLength-1) - 'A' +1;

        for(int i=(strLength-2);i>=0;i--)
        {
            ans = ans+ ((int)s.charAt(i)-'A'+1)*(int)Math.pow(26,(strLength-1)-i);

        }
        return ans;
        
    }
}