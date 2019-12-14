class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        
       int noOf5 =0;
       int noOf10 =0;

        if(bills[0]>5)
        {
            return false;
        }
        else
        {
            noOf5++;
        }

        for(int i=1;i<bills.length;i++)
        {

                int change = bills[i] -5;

                if(change ==0)
                {
                    noOf5++;
                }
                else if(change ==5)
                {
                    if(noOf5==0)
                    {
                        return false;
                    }
                    noOf10++;
                    noOf5--;

                }
                else
                {
                    if(noOf5 ==0 || (noOf10 ==0&&noOf5<3))
                    {
                        return false;
                    }
                    if(noOf10 ==0 && noOf5 >=3)
                    {
                        noOf5 -= 3;
                    }
                    else
                    {
                        noOf5--;
                        noOf10--;
                    }
                }
        }

        return true;
        
    }
}