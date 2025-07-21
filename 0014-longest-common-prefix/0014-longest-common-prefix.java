class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLen = Math.min(first.length(), last.length());
        int i = 0;
        StringBuilder str = new StringBuilder();
        while(i < minLen && first.charAt(i) == last.charAt(i)) {
            str.append(first.charAt(i));
            i++;
        }
        return str.toString();
    }
}