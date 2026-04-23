class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (record.containsKey(target - nums[i])) {
                return new int[] { record.get(target - nums[i]), i };
            } else {
                record.put(nums[i], i);
            }
        }
        return new int[0];
        
    }
}
