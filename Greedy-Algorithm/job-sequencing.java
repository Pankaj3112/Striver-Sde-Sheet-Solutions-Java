
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        
        // find max deadline
        int maxD = 0;
        for(int i=0; i<n; i++){
            if(arr[i].deadline>maxD){
                maxD = arr[i].deadline;
            }
        }
        
        int[] result = new int[maxD+1];
        Arrays.fill(result, -1);
        
        int jobcount=0, profit=0;
        
        for(int i=0; i<n; i++){
            for(int j=arr[i].deadline; j>0; j--){
                if(result[j]==-1){
                    result[j]=i;
                    jobcount++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }
        
        int[] ans = new int[2];
        ans[0] = jobcount;
        ans[1] = profit;
        
        return ans;
    }
}