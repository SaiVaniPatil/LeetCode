class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum < 0? nums[i] : (sum + nums[i]);
            max = Math.max(sum, max);
        }
       return max;
        
    }
}