class Solution {
    public int removeElement(int[] nums, int val) {
        int gap = 0, i = 0;
        for (i = 0; i < nums.length - gap;) {
            nums[i] = nums[i + gap];
            if (nums[i] == val) {
                gap++;
                continue;
            }
            i++;
        }
        return i;
    }
}