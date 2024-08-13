/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // copy the value of the next node
        node.val = node.next.val;
        // delete the next node instead
        node.next = node.next.next;
    }
}