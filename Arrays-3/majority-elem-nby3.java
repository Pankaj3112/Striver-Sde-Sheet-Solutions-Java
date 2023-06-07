public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1=0, cnt2=0;
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(cnt1==0 && elem2 != nums[i]){
                cnt1++;
                elem1 = nums[i];
            }
            else if(cnt2==0 && elem1 != nums[i]){
                cnt2++;
                elem2 = nums[i];
            }
            else if(nums[i] == elem1){
                cnt1++;
            }
            else if(nums[i] == elem2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        int cntE1 = 0;
        int cntE2 = 0;

        for(int i=0; i<n; i++){
            if(elem1 != Integer.MIN_VALUE && nums[i]==elem1){
                cntE1++;
            }
            else if(elem2 != Integer.MIN_VALUE && nums[i]==elem2){
                cntE2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(cntE1 > n/3){
            ans.add(elem1);
        }
        if(cntE2 > n/3){
            ans.add(elem2);
        }

        return ans;
    }
} {
    
}
