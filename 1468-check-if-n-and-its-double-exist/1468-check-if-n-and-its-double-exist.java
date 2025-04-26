class Solution {
    public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
       for(int i=0; i<arr.length; i++) {
        for(int j=0; j<arr.length; j++) {
            if(arr[j] > 2*arr[i]) {
                break;
            }
            if(arr[j] == 2*arr[i] && i != j) {
                return true;
            }
        }
       } 
       return false;
    }
}