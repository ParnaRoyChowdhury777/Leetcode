class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }

        for(int element: hs) {
            if(!hs.contains(element - 1)) {
                int cnt = 1;
                int x = element;
                while(hs.contains(x + 1)) {
                    x = x + 1;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}