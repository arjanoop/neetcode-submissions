class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int []frequency = new int[26];
        buildSFreq(s, frequency);
        return validateTFreq(t, frequency);
    }

    private void buildSFreq(String s, int[] sFreq){
        for(char sc: s.toCharArray()){
           sFreq[(int)sc % (int)'a']++;
        }
    }

    private boolean validateTFreq(String s, int[] sFreq){
        for(char sc: s.toCharArray()){
            if(sFreq[(int)sc % (int)'a']<=0){
                return false;
            }else{
                sFreq[(int)sc % (int)'a']--;
            }
        }
        return checksum(sFreq)==0;
    }

    private int checksum(int[] freq){
        for(int i=1; i<freq.length; i++){
            freq[i]=freq[i]+freq[i-1];
        }
        return freq[freq.length-1];
    }
}
