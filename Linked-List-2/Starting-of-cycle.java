//HashSet solution 
//time complexity : O(n)
//space complexity : O(n)

// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> map = new HashSet<>();
//         ListNode temp = head;

//         while(temp != null){
//             if(map.contains(temp)){
//                 break;
//             }

//             map.add(temp);
//             temp = temp.next;
//         }

//         return temp;
//     }
// }


//slow and fast pointer solution
//time complexity : O(n)
//space complexity : O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(fast!=slow){
                    slow = slow.next;
                    fast = fast.next;
                }

                return fast;
            }
        }

        return null;
    }
}