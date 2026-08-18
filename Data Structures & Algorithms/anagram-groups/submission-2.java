class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String s: strs){
            char []currentVal = s.toCharArray();
            Arrays.sort(currentVal);
            String key = new String(currentVal);
            if(!groupedAnagrams.containsKey(key)){
                groupedAnagrams.put(key,new ArrayList<>());
            }
            groupedAnagrams.get(key).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
