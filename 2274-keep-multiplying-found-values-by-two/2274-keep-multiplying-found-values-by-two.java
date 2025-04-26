class Solution {
    public boolean search(int[] nums, int n) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == n) {
                return true;
            } else if(nums[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {

        while(search(nums, original) != false) {
            original *= 2;
        }
        return original;
    }
}