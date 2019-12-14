class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        
        int initialValue = nums[0];
        int j=1;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==initialValue)
            {
                continue;
            }
            else
            {
                nums[j] = nums[i];
                j++;
                initialValue = nums[i];
                
            }
        }
        
        return j;
        
    }
}