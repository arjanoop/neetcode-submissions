class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueVals = new HashSet<>();
        for(int n: nums){
            if(uniqueVals.contains(n)){
                return true;
            }else{
                uniqueVals.add(n);
            }
        }
        return false;
    }
}