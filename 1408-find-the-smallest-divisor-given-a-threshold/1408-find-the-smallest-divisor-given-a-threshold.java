class Solution {
    public int sumOfD(int[] nums, int mid) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += Math.ceil((double)nums[i] / (double)mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int high=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > high) {
                high = nums[i];
            }
        }
        int low = 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(sumOfD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}