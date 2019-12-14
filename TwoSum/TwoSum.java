class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        int i=0;
        int j= i+1;
        while(j<nums.length)
        {
            if(nums[i]+nums[j] == target)
            {
                ans = new int[] {i,j};
                break;
            }
            j++;
            if(i==j)
            {
                j++;
            }
            if(j==nums.length)
            {
                j=0;
                i++;
            }
            if(i==nums.length-1)
            {
                return null;
            }
        }
        System.out.println("i is"+i +"and j is "+j);
        return ans;
    }
}