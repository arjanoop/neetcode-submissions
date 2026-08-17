class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> frequency = new HashMap<>();
        buildSFreq(s, frequency);
        return validateTFreq(t, frequency);
    }

    private void buildSFreq(String s, Map sFreq){
        for(char sc: s.toCharArray()){
            if(sFreq.containsKey(sc)){
                sFreq.put(sc, ((int)sFreq.get(sc))+1);
            }else{
                sFreq.put(sc, 1);
            }
        }
        System.out.println(sFreq);
    }

    private boolean validateTFreq(String s, Map sFreq){
        for(char sc: s.toCharArray()){
            if(!sFreq.containsKey(sc)){
                return false;
            }else{
                int newFreq = ((int)sFreq.get(sc))-1;
                if(newFreq>0){
                    sFreq.put(sc, newFreq);
                }else{
                    sFreq.remove(sc);
                }
            }
        }
        return sFreq.size()==0;
    }
}
