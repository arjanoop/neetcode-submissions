class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            String key = getAnagramValue(s);
            List<String> value = map.getOrDefault(key, new ArrayList<>());
            value.add(s);
            map.put(key,value);
        }
        return map.values().stream().toList();
    }

    private String getAnagramValue(String s){
        int []stringFreq = new int[26];
        for(char c: s.toCharArray()){
            stringFreq[c%'a']++;
        }
        StringBuilder value= new StringBuilder();
        for(int i=0; i<stringFreq.length; i++){
            if(stringFreq[i]>0){
                char c = (char)('a'+i);
                value.append(c);
                value.append(stringFreq[i]);
            }
        }
        return value.toString();
    }
}
