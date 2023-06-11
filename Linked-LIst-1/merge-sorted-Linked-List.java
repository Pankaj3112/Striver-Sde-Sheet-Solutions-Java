class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode mover = dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                mover.next = l1;
                l1 = l1.next;
            }
            else{
                mover.next = l2;
                l2 = l2.next;
            }
            
            mover = mover.next;

        }

        while(l1!=null){
            mover.next = l1;
            l1 = l1.next;
            mover = mover.next;
        }

        while(l2!=null){
            mover.next = l2;
            l2 = l2.next;
            mover = mover.next;
        }

        return dummy.next;
    }
}
