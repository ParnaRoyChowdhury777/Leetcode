class Solution {
    public boolean search(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == x) {
                return true;
            } else if(nums[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } 
        return false;
    }
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        for(int i=n; i>=0; i--) {
            if(nums[i] < 0) {
                break;
            }
            if(search(nums, (-1)*nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}