class Solution {
    public int rob(int[] nums) 
    {
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0],nums[1]);
        
        int [] dpArray = new int[nums.length];
        dpArray[0]=nums[0];
        dpArray[1] = Math.max(dpArray[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            dpArray[i] = Math.max(dpArray[i-1],dpArray[i-2]+nums[i]);
        }
        return dpArray[nums.length-1];
        
        
    }
}