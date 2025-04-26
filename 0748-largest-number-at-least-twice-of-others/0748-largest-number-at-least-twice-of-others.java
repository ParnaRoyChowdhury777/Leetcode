class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0], ind = 0, slargest = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
                ind = i;
            } else if(nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }

        if(largest >= 2*slargest) {
            return ind;
        }

        return -1;
    }
}