class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> k = new HashSet<>();
        for(int i = 0 ; i< nums.length; i++){
            if(k.add(nums[i])){
                continue;
            }else{
                return true;
            }
        }
        return false;
        
    }
}