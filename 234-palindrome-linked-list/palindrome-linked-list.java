/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse nodes after slow pointer
        slow.next = reverse(slow.next);
        // Check Palindrome
        slow = slow.next;
        while (slow != null) {
            if (slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}