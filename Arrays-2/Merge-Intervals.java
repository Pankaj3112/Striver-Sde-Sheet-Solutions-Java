//LeetCode: https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        //Copy to arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int[] row : intervals){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int x : row){
                temp.add(x);
            }
            list.add(temp);
        }

        //sort the Arraylist on the basis of 0th element of each inner Arraylist
        Collections.sort(list, (a,b)->a.get(0)-b.get(0));

        //merge 
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(list.get(0));

        for(int i=1; i<list.size(); i++){
            ArrayList<Integer> inner = list.get(i);

            if(inner.get(0) > ans.get(ans.size()-1).get(1)){
                ans.add(inner);
            }
            else{
                ans.get(ans.size()-1).set(1, Math.max(inner.get(1), ans.get(ans.size()-1).get(1)));
            }
        }

        //convert ans to Array
        int[][] res = new int[ans.size()][2];

        for(int i=0; i<res.length; i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;
    }
}
