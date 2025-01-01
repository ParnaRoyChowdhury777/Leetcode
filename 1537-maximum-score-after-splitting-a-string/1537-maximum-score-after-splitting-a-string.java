class Solution {

    int count(String s, char n) {
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == n)
               cnt++;
        }
        return cnt;
    }

    public int maxScore(String s) {
        int res = 0;
        for(int i=0; i<s.length() - 1; i++) {
            String s1 = s.substring(0, i+1);
            String s2 = s.substring(i+1, s.length());
            if(count(s1, '0') + count(s2, '1') > res)
                  res = count(s1, '0') + count(s2, '1');
        }
        return res;
    }
}