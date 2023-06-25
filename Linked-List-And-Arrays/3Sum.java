class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int j=i+1;
                int k = n-1;
                int sum = 0-nums[i];
                while(j<k){
                    int twoSum = nums[j]+nums[k];
                    if(sum == twoSum){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        ans.add(inner);

                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;

                        j++;
                        k--;
                    }
                    else if(twoSum<sum){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }

        }

        return ans;
    }
}
