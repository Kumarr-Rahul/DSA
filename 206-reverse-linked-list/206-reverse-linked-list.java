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
//     public ListNode reverseList(ListNode head) {
//         left = head;
//         helper(head);  
//         return head;
//     }
    
//     boolean work = true;
//     ListNode left;
//     void helper(ListNode right){
//         if(right == null){
//             return;
//         }
//         helper(right.next);
        
//         if(work){
//             if(left == right || left.next == right){
//                 work = false;
//             } 
            
//             int temp = left.val;
//             left.val = right.val;
//             right.val = temp;
            
//             left = left.next;
//         }
        
//     }
    
// }

//Approach 2

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        helper(head);
        head.next = null;
        return nhead;
    }
    
    ListNode nhead;
    void helper(ListNode node){
        if(node.next == null){
            nhead = node;
            return;
        }
        
        helper(node.next);
        node.next.next = node;
    } 
}