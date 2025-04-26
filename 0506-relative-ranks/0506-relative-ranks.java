class Solution {
    public String[] findRelativeRanks(int[] score) {
        int copyScore[] = score.clone();
        String[] result = new String[score.length];

        Arrays.sort(copyScore);
        
        for(int i=0; i<score.length; i++) {
            if(score[i] == copyScore[score.length - 1]) {
                result[i] = "Gold Medal";
            } else if(score[i] == copyScore[score.length - 2]) {
                result[i] = "Silver Medal";
            } else if(score[i] == copyScore[score.length - 3]) {
                result[i] = "Bronze Medal";
            } else {
                int pos = -1;
                for (int j = 0; j < copyScore.length; j++) {
                    if (copyScore[j] == score[i]) {
                        pos = copyScore.length - j;
                        break;
                    }
                }
                result[i] = String.valueOf(pos);
            }
        }

        return result;
    }
}