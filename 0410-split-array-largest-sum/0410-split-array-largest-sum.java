class Solution {
    public int fun(int[] nums, int k) {
        int s=1, count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] + count <= k) {
                count += nums[i];
            } else {
                s++;
                count = nums[i];
            }
        }
        return s;
    }
    public int splitArray(int[] nums, int k) {
       if(nums.length < k) return -1;
       int low = Integer.MIN_VALUE, high = 0;
       for(int i=0; i<nums.length; i++) {
        if(nums[i] > low) {
            low = nums[i];
        }
        high += nums[i];
       } 
       while(low <= high) {
        int mid = low + (high - low) / 2;
        int cnt = fun(nums, mid);
        if(cnt > k) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
       }
       return low;
    }
}