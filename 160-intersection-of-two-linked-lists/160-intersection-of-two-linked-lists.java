/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
    
//     public int size(ListNode head) {
//         int size = 0;
//         while(head != null) {
//             head = head.next;
//             size++;
//         }
//         return size;
//     }
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         int sizeA = size(headA);
//         int sizeB = size(headB);
        
//         //reducing long LL
//         if(sizeA > sizeB) {
//             for(int i = 0; i < sizeA - sizeB; i++) {
//                 headA = headA.next;
//             }
//         }
        
//         if(sizeB > sizeA) {
//             for(int i = 0; i < sizeB - sizeA; i++) {
//                 headB = headB.next;
//             }
//         }
        
//         while(headA != headB) {
//             headA = headA.next;
//             headB = headB.next;
//         }
        
//         return headA;
//     }
// }




public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sa = getSize(headA);
        int sb = getSize(headB);
        int gap = sa - sb;
        
        if(gap >= 0){
            for(int i = 0; i < gap; i++){
                headA = headA.next;
            }
        } else {
            gap = Math.abs(gap);
            for(int i = 0; i < gap; i++){
                headB = headB.next;
            }
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    int getSize(ListNode temp){
        int sz = 0;
        
        while(temp != null){
            sz++;
            temp = temp.next;
        }
        
        return sz;
    }
}