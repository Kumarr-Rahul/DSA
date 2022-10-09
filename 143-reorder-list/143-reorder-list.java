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
    
//     public static ListNode getMid(ListNode head) {
        
//         ListNode slow = head, fast = head;
//         while(fast.next != null && fast.next.next != null){
            
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         return slow;
//     }
    
//     public ListNode reverse(ListNode head) {
        
//         ListNode prev = null;
//         ListNode curr = head;
        
//         while(curr != null){
//             ListNode ahead = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = ahead;
//         }
        
//         return prev;
//     }
    
//     public void reorderList(ListNode head) {
//         ListNode mid = getMid(head);
//         ListNode second = reverse(mid.next);
//         mid.next = null;
        
//         ListNode dummy = new ListNode(-1);
//         ListNode tail = dummy;
        
//         while(head != null || second != null) {
            
//             if(head != null) {
//                 tail.next = head;
//                 tail = head;
//                 head = head.next;
//             }
            
//             if(second != null) {
//                 tail.next = second;
//                 tail = second;
//                 second = second.next;
//             }
//         }
        
//         tail.next = null;
//         head =  dummy.next;
//     }
// }

//2nd

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        
        left = head;
        helper(head);
    }
    
    ListNode left;
    boolean work = true;
    void helper(ListNode right){
        if(right == null){
            return;
        }
        
        helper(right.next);
        
        if(work == true && (left == right || left.next == right)){
            right.next = null;
            work = false;
        } else if(work == true) {  
            ListNode temp = left.next;

            left.next = right;
            right.next = temp;

            left = temp;
        }
        
        
    }
}