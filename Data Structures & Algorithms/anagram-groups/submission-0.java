class Solution {
    
      public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> record = new HashMap<>();
        for(String str : strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);
            if (record.containsKey(sorted)) {
                List<String> list  = record.get(sorted);
                list.add(str);
                record.put(sorted, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                record.put(sorted, list);
            }
        }
        return new ArrayList<>(record.values());
    }
}
