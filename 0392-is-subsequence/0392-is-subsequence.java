class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }
        int i=0, j=0, cnt=s.length();
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                cnt--;
            } else {
                j++;
            }
        }
        if(cnt == 0) {
            return true;
        }
        return false;
    }
}