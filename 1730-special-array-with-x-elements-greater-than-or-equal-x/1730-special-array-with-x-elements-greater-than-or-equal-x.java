class Solution {
    public int howManyGreater(int nums[], int x) {
        int low = 0, high = nums.length - 1, ans = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= x) {
                ans = nums.length - mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } 
        return ans;
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            int cnt = howManyGreater(nums, mid);
            if(cnt == mid) {
                return mid;
            }
            else if(cnt > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}