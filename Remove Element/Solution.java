class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0) return 0;
        
        int j=-1;
        
  for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == val && j ==-1)
            {
                j=i;
            }
            else if(j!=-1 && nums[i] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i=j++;
                j=-1;

            }

        }
        
        return j==-1?nums.length:j;
    }
}