class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0, j=1; i<nums.length-1;){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }else{
                j++;
                if(j==nums.length){
                    i++;
                    j=i+1;
                }
            }

        }
        return new int[]{-1,-1};
    }
}
