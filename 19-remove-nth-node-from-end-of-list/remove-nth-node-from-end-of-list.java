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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0, index = 0;
        // calculate the size of the linked list
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        // calculate the index of the node that has to be removed
        index = (size - n);
        // remove the node
        int counter = 0;
        curr = head;
        while(curr != null) {
            counter++;
            // edge case if we need to remove first node
            if(n == size) {
                head = head.next;
                break;
            }
            // one node before the node that has to be removed
            if(index == counter) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}