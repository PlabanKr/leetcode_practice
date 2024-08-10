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
class Solution {
    // This solution has O(N) + O(N) = O(2N) time complexity
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     int size = 0, index = 0;
    //     // calculate the size of the linked list
    //     ListNode curr = head;
    //     while(curr != null) {
    //         size++;
    //         curr = curr.next;
    //     }
    //     // calculate the index of the node that has to be removed
    //     index = (size - n);
    //     // remove the node
    //     int counter = 0;
    //     curr = head;
    //     while(curr != null) {
    //         counter++;
    //         // edge case if we need to remove first node
    //         if(n == size) {
    //             head = head.next;
    //             break;
    //         }
    //         // one node before the node that has to be removed
    //         if(index == counter) {
    //             curr.next = curr.next.next;
    //             break;
    //         }
    //         curr = curr.next;
    //     }
    //     return head;
    // }

    // Optimal Approach: Fast Pointer, Slow Pointer
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // The idea is to first move fast pointer until it reaches n
        // Then slow pointer will start from the head
        // The loop will go on until fast pointer comes to the last node
        // Then we just have to remove the next of slow pointer
        
        ListNode fast = head, slow = head;
        for(int i = 0; i< n; i++) {
            fast = fast.next;
        }
        // if fast becomes null then then element must next of head
        if(fast == null)
            return head.next;
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}