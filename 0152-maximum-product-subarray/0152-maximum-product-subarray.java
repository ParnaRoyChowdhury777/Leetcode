class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i=0; i<nums.length; i++) {
            if(prefix == 0) {
                prefix = 1;
            } 
            if(suffix == 0) {
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }
}