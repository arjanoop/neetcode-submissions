class Solution {
    public String longestCommonPrefix(String[] strs) {
        int commonPrefixLen = 0, maxEdge = strs[0].length();
        for (String s : strs) {
            if (s.length() < maxEdge) {
                maxEdge = s.length();
            }
        }
        for(int i=0,j=0; i<maxEdge;){
            if(strs[0].charAt(i)!=strs[j].charAt(i)){
                break;
            }else{
                j++;
                if(j==strs.length){
                    commonPrefixLen++;
                    i++;
                    j=0;
                }
            }
        }
        return strs[0].substring(0, commonPrefixLen);
    }
}