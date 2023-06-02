//LeetCode https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int Currsum = 0;

        for(int i=0; i<nums.length; i++){
            Currsum+= nums[i];
            max = Math.max(max, Currsum);
            if(Currsum <0){
                Currsum = 0;
            }
        }

        return max;
    }
}