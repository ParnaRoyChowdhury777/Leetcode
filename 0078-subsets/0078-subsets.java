class Solution {
    public void func(int i, List<Integer> ds, int[] nums, int n, List<List<Integer>> res) {
        if(i == n) {
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        func(i+1, ds, nums, n, res);
        ds.remove(ds.size() - 1);
        func(i+1, ds, nums, n, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        func(0, ds, nums, n, res);
        return res;
    }
}