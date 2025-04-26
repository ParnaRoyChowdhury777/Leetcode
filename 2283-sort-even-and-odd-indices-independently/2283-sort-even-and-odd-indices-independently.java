class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        int evenIndex = 0, oddIndex=0;

        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                nums[i] = even.get(evenIndex);
                evenIndex++;
            } else {
                nums[i] = odd.get(oddIndex);
                oddIndex++;
            }
        }

        return nums;
    }
}