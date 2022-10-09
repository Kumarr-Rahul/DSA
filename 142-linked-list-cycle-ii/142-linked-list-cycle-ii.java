/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
       
//         ListNode slow = head, fast = head;
        
//          while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
            
//             if(fast == slow) {
//                 break;
//             }
//         }
        
//         if(fast == null || fast.next == null) {
//             return null;  //no cycle
//         }
        
       
        
    
//     ListNode curr1 = head, curr2 = slow;
//     while(curr1 != curr2){
//         curr1 = curr1.next;
//         curr2 = curr2.next;
//     }
//     return curr1;
//   }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                
                return fast;
            }
        }
        
        return null;
    }
}