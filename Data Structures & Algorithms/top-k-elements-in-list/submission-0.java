class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(record.containsKey(nums[i])){
                record.put(nums[i], record.get(nums[i])+1);
            }else{
                record.put(nums[i], 1);
            }
        }
        int[] frequency = new int[k];

        List<Integer> keys = new ArrayList<>(record.keySet());
        keys.sort((a,b) -> record.get(b) - record.get(a));
        for(int i = 0; i<k; i++){
            frequency[i] = keys.get(i);
        }
        return frequency;
    }
}
