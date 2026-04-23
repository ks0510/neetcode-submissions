class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> record = new HashMap<>();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for(int i = 0 ; i< a.length; i++){
            if(record.containsKey(a[i])){
                record.put(a[i], record.get(a[i])+1);
            }else{
                record.put(a[i], 1);
            }
        }
        for(int  i = 0 ; i< b.length; i++){
            if(record.containsKey(b[i])){
                int count = record.get(b[i]);
                if(count-1>0){
                record.put(b[i], count-1);
                }else{
                    record.remove(b[i]);
                }
            }
        }
        return record.isEmpty();
    }
  
}
