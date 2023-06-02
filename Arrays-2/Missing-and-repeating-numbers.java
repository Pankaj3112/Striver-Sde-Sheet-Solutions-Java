// Coding Ninjas : https://www.codingninjas.com/codestudio/problems/missing-and-repeating-numbers_1088572?leftPanelTab=0


import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int duplicate = -1;
        int sum = 0;

        for(Integer i: arr){
            if(map.get(i)==2){
                duplicate = i;
            }
            sum+=i;
        }


        int missing = (n*(n+1) / 2) - (sum- duplicate);

        int[] ans = new int[2];
        ans[0] = missing;
        ans[1] = duplicate;

        return ans;
    }
}