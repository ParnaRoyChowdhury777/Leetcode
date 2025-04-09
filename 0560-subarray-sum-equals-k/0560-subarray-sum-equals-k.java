class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int prefixSum = 0, cnt = 0;

        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum - k;
            
            if(mpp.containsKey(rem)) {
                cnt += mpp.get(rem);
            }
            
            if (mpp.containsKey(prefixSum)) {
                mpp.put(prefixSum, mpp.get(prefixSum) + 1);
            } else {
                mpp.put(prefixSum, 1);
            }
            

                
            
        }

        return cnt;
    }
}