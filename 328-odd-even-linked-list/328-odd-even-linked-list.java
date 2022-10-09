/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */
// class Solution {
    
//     public static ListNode reverse(ListNode head) {
        
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
    
//     public ListNode oddEvenList(ListNode head) {
//         ListNode firstHead = new ListNode(-1);
//         ListNode secondHead = new ListNode(-1);
//         ListNode first = firstHead, second = secondHead;

//         while(head != null)
//         {
//             first.next = head;
//             first = head;
//             head = head.next;

//             if(head != null) {
//                 second.next = head;
//                 second = head;
//                 head = head.next;
//             }
//         }

     

//         second.next = null;
//         first.next = secondHead.next;
//         return firstHead.next;
//     }
// }

//2nd

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddH = head;
        ListNode evenH = head.next;
        
        ListNode odd = oddH;
        ListNode even = evenH;
        ListNode temp = head.next.next;
        
        oddH.next = null;
        evenH.next = null;
        
        int counter = 1;
        while(temp != null){
            ListNode next = temp.next;
            
            temp.next = null;
            if(counter % 2 == 1){
                odd.next = temp;
                odd = temp;
            } else {
                even.next = temp;
                even = temp;
            }
            
            counter++;
            temp = next;
        }
        
        odd.next = evenH;
        return oddH;
    }
}