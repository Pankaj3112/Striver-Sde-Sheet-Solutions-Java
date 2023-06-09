class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, height[i]);
            prefix[i] = max;
        }

        max = 0;
        for(int i=n-1; i>=0; i--){
            max = Math.max(max, height[i]);
            suffix[i] = max;
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans += Math.min(prefix[i], suffix[i]) - height[i];
        }

        return ans;
    }
}