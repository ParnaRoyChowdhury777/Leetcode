class Solution {

    public void merge(int nums[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i=low, j=mid+1;
        while(i <= mid && j <= high) {
            if(nums[i] <= nums[j]) {
                temp.add(nums[i++]);
            } else {
                temp.add(nums[j++]);
            }
        }
        while(i <= mid) {
            temp.add(nums[i++]);
        }
        while(j <= high) {
            temp.add(nums[j++]);
        }

        for(int k=low; k<=high; k++) {
            nums[k] = temp.get(k - low);
        }
    }

    public int countPairs(int nums[], int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for(int i=low; i<=mid; i++) {
            while(right <= high && (long)nums[i] > 2L*nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public int mergeSort(int nums[], int low, int high) {
        int count = 0;
        if(low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}