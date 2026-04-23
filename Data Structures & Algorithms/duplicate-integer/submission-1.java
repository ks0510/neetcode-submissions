class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> record = new HashSet<>();
        boolean duplicate;
        for(int num : nums){
          if (!record.add(num)) {
            return true;
          }
        }
        return false;
    }
}