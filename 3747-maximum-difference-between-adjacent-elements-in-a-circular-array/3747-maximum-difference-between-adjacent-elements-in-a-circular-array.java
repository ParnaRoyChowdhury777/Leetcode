class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi = Integer.MIN_VALUE, diff = 0;

        for(int i=0; i<nums.length; i++) {
            if(i == nums.length - 1) {
                diff = Math.abs(nums[i] - nums[0]);
            } else {
                diff = Math.abs(nums[i] - nums[i+1]);
            }

            maxi = Math.max(maxi, diff);
        }

        return maxi;
    }
}