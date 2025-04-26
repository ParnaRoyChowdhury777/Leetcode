class Solution {
    public int distinctAverages(int[] nums) {
       HashSet<Double> st = new HashSet<>();
       int start = 0, end = nums.length;
       for(int i=1; i<=nums.length/2; i++) {
        Arrays.sort(nums, start, end);
        st.add((nums[start] + nums[end - 1]) / 2.0);
        start++;
        end--;
       } 
       return st.size();
    }
}