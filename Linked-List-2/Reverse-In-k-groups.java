class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0)
            return head;

        // check if length is greator than k
        ListNode temp = head;
        int cnt = 0;
        while(cnt<k){
            if(temp==null){
                return head;
            }
            cnt++;
            temp = temp.next;
        }
 
        ListNode  cur = head;
        ListNode  prev = null;
        ListNode next = null;
 
        cnt = 0;
 
        while (cur != null && cnt < k) {
 
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
 
            cnt++;
        }
 
        head.next = reverseKGroup(cur, k);
 
        return prev;
    }
}
