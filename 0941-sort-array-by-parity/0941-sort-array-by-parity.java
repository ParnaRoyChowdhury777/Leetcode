class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0, k=0;
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                ans[j++] = nums[i];
            } else {
                ans[nums.length - k - 1] = nums[i];
                k++;
            }
        }

        return ans;
    }
}