class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int [] visited = new int[fruits.length];
        int count = 0, flag = 0;
        for(int i=0; i<fruits.length; i++) {
            flag = 0;
            for(int j=0; j<baskets.length; j++) {
                
                if(fruits[i] <= baskets[j]) {
                    baskets[j] = 0;
                    flag = 1;
                    break;
                }
                    
          
            }

            if(flag == 0) {
                count += 1;
            }
               
          
        


        }
        return count;
    }
}