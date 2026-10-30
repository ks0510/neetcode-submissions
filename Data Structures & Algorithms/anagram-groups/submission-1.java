class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
            String s = strs[i];
            char [] array = s.toCharArray();
            Arrays.sort(array);
            String str = new String(array);
            if(map.containsKey(str)){
                List l = map.get(str);
                l.add(s);
                map.put(str, l);
            }else{
                List<String> lt = new ArrayList<>();
                lt.add(s);
                map.put(str, lt);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}
