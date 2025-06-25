class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        String s = Integer.toBinaryString(z);
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}