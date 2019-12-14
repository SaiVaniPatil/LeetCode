class Solution {
    public int maxProfit(int[] prices) {
        
       int max =0;
        int tmp =0;
        for(int i=1;i<prices.length;i++)
        {
            tmp =tmp+prices[i]-prices[i-1];
            if(tmp<0)
            {
                tmp=0;
            }
            else if(tmp>max)
            {
                max =tmp;
            }
                
        }
        
        return max;
        
    }
}