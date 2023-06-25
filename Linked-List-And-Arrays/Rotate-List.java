
class Solution {
    public int getLen(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {

        int length = getLen(head);
        if(k==0 || head==null || k%length==0){
            return head;
        }
        
        int moveto = length - (k % length)-1;
        ListNode curr=head;
        ListNode res = null;

        while(curr.next!=null){
            if(moveto==0){
                ListNode fwd = curr.next;
                curr.next = null;
                curr = fwd;
                res = fwd;
            }
            else{
                curr = curr.next;
            }
            moveto--;
        }

        curr.next = head;
        return res;
    }
}
