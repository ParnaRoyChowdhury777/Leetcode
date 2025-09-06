class Solution {
    public void func(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        if(ind == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target) {
            ds.add(arr[ind]);
            func(ind, arr, target - arr[ind], ds, ans);
            ds.remove(ds.size() - 1);
        }
        func(ind+1, arr, target, ds, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(0, candidates, target, ds, ans);
        return ans;
    }
}