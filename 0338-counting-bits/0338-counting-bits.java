class Solution {
    public int count1s(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++) {
            result[i] = count1s(i);
        }
        return result;
    }
}