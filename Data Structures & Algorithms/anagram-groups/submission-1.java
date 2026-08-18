class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            String key = s.length()+"_"+getAnagramValue(s);
            List<String> value = map.getOrDefault(key, new ArrayList<>());
            value.add(s);
            map.put(key,value);
        }
        return map.values().stream().toList();
    }

    private String getAnagramValue(String s){
        char[] sortedAnagrams = s.toCharArray();
        Arrays.sort(sortedAnagrams);
        return new String(sortedAnagrams);
    }
}
