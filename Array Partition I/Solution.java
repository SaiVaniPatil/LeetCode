class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=(nums.length-2);i>=0;)
        {
            sum = sum+ nums[i];
            i=i-2;
        }
        
        return sum;
    }
}