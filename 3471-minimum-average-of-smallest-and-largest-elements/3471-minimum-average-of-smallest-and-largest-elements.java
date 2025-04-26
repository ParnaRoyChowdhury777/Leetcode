class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        ArrayList<Double> averages = new ArrayList<>();
        int start = 0, end = n;
        for(int i=1; i<=n/2; i++) {
            Arrays.sort(nums, start, end);
            averages.add((nums[start] + nums[end-1]) / 2.0);
            start++;
            end--;
        }
        Collections.sort(averages);
        return averages.get(0);
    }
}