/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//         ListNode dummy = new ListNode(-1);
//         ListNode head = dummy, tail = dummy;
//         int carry = 0;
        
//         while(l1 != null || l2 != null || carry > 0){
            
//             int d1 = (l1 == null) ? 0 : l1.val;
//             int d2 = (l2 == null) ? 0 : l2.val;
            
//             ListNode temp = new ListNode((d1 + d2 + carry) % 10);
//             carry = (d1 + d2 + carry) / 10;
            
//             tail.next = temp;
//             tail = temp;
            
//             if(l1 != null) l1 = l1.next;
//             if(l2 != null) l2 = l2.next;
//         }
        
//         return dummy.next;
        
//     }
// }




class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prev = null;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry != 0){
            ListNode res = new ListNode();
            
            res.val = carry;
            if(l1 != null){
                res.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                res.val += l2.val;
                l2 = l2.next;
            }
            
            carry = res.val / 10;
            res.val = res.val % 10;
            
            if(head == null){
                head = res;
                prev = res;
            } else {
                prev.next = res;
                prev = res;
            }
        }
        
        return head;
    }
}