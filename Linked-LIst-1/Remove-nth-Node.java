class Solution {
    public int getLength(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
        n = length-n;

        ListNode curr = head, prev = null;

        while(curr!=null){
            if(n==0){
                if(prev==null){
                    head = head.next;
                    break;
                }
                else{
                    ListNode fwd = curr.next;
                    prev.next = fwd;
                    break;
                }
            }

            prev = curr;
            curr = curr.next;
            n--;
        }

        return head;
    }
}
