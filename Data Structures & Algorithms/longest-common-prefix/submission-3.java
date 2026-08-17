class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for (int i = 0, j = 0; i < strs[0].length();) {
            try {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    break;
                } else {
                    j++;
                    if (j == strs.length) {
                        res = res + (strs[0]).charAt(i);
                        i++;
                        j = 0;
                    }
                }
            }catch(Exception e){
                break;
            }
        }
        return res;
    }
}