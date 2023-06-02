//LeetCode https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        ans.add(firstrow);


        for(int i=1; i<numRows; i++){
            List<Integer> inner = new ArrayList<>();
            inner.add(1);

            if(ans.get(i-1).size()>1){
                for(int j=0; j<ans.get(i-1).size()-1; j++){
                    inner.add(ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
                }
            }

            inner.add(1);

            ans.add(inner);
        }

        return ans;

    }
}