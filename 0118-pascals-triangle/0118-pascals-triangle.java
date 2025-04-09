class Solution {

    public ArrayList<Integer> generateRow(int row) {
        ArrayList<Integer> ansRow = new ArrayList<Integer>();

        int ans = 1;

        ansRow.add(1);

        for(int col=1; col<row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }

        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=numRows; i++) {
            ans.add(generateRow(i));
        }

        return ans;
    }
}