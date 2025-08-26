class Solution {
    public boolean isFascinating(int n) {
        int n2 = 2 * n;
        int n3 = 3 * n;
        String s1 = String.valueOf(n);
        String s2 = String.valueOf(n2);
        String s3 = String.valueOf(n3);
        String res = s1 + s2 + s3;
        if(res.indexOf('0') != -1) return false;
        if(res.length() != 9) return false;
        char temp[] = res.toCharArray();
        Arrays.sort(temp);
        for(int i=0; i<temp.length; i++) {
            if(temp[i] != (char)('1' + i)) {
                return false;
            }
        }
        return true;
    }
}