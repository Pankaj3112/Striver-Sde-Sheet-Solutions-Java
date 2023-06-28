import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    class meeting{
        int start;
        int end;
        public meeting(int s, int e){
            this.start = s;
            this.end = e;
        }
    }
    
    class meetingComparator implements Comparator<meeting>
    {
        @Override
        public int compare(meeting o1, meeting o2) 
        {
            if (o1.end < o2.end)
                return -1;
            else
                return 1;
        }
    }
    
    
    int maxMeetings(int start[], int end[], int n){
        
        ArrayList<meeting> meetings = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            meeting m = new meeting(start[i], end[i]);
            meetings.add(m);
        }
        
        meetingComparator mc = new meetingComparator();
        Collections.sort(meetings, mc);
        
        int count = 1;
        int limit = meetings.get(0).end;
        
        for(int i=1; i<n; i++){
            if(meetings.get(i).start > limit){
                count++;
                limit = meetings.get(i).end;
            }
        }
        
        return count;
    }
}
