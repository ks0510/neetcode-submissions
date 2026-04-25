class Solution {

    public String encode(List<String> strs) {
        StringBuilder code  = new StringBuilder();
        for(String str : strs){
            int length = str.length();
            code.append(length).append("#").append(str);
        }
        return code.toString();

    }

    public List<String> decode(String str) {
        int i = 0 ;
        List<String> list = new ArrayList<>();
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1, j+1+length));
            i = j + 1 + length;

        }
        return list;

    }
}
