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
    public ListNode getKthNode(ListNode curr, int k) {
        while(curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode grpPrev = dummy;
        while(true) {
            ListNode kthNode = getKthNode(grpPrev, k);
            if(kthNode == null)
                break;
            ListNode grpNext = kthNode.next;

            // Reverse the Group
            ListNode prev = kthNode.next;
            ListNode curr = grpPrev.next;
            while(curr != grpNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Link the reversed part with rest of the list
            ListNode temp = grpPrev.next;
            grpPrev.next = kthNode;
            grpPrev = temp;
        }
        return dummy.next;
    }
}