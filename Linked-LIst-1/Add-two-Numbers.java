class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1!=null || l2!=null || carry!=0){
            int Val1 = 0;
            int Val2 = 0;

            if(l1!=null){
                Val1 = l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                Val2 = l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode((Val1+Val2+carry)%10);
            temp = temp.next;
            carry = (Val1+Val2+carry)/10;
        }

        return dummy.next;
    }
}