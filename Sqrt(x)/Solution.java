class Solution {
    public int mySqrt(int x) {
        
        long i=0,j=x/2;
        while(i<=j)
        {
            long mid = (i+j)/2;
            long mid2 = mid+1;
            if(mid*mid<=x&&mid2*mid2>x)
            {
                return (int)mid;
            }
            if(mid*mid<x)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return (int)i;
        
    }
}