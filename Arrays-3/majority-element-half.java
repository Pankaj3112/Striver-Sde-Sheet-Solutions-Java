//moore's voting algo

// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         int  ele = nums[0];
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             if(count == 0){
//                 count=1;
//                 ele = nums[i];
//             }
//             else if(ele == nums[i]){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }

//         return ele;
//     }
// }

//CODING NINJAS
import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count = 0;
		int ele = arr[0];

		for(int i=0; i<n; i++){
			if(count==0){
				count++;
				ele=arr[i];
			}
			else if(ele == arr[i]){
				count++;
			}
			else{
				count--;
			}
		}

		//checking part
		int countofEle = 0;
		for(int i=0; i<n; i++){
			if(arr[i] == ele){
				countofEle++;
			}
		}

		if(countofEle > n/2){
			return ele;
		}

		return -1;
	}
}