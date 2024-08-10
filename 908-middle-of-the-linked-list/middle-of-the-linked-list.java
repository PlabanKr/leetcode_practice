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
    // This brute force approach has time complexity of O(N)+O(N/2) and O(1) space complexity
    // public ListNode middleNode(ListNode head) {
    //     int size = 0;
    //     ListNode temp = head;
    //     while(temp != null) {
    //         size++;
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     int midPos = (size / 2) + 1;
    //     int counter = 0;
    //     while(temp != null) {
    //         counter++;
    //         if(counter == midPos) {
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     return temp;
    // }

    // The fast pointer and slow pointer approach
    // Time Complexity: O(N/2)
    // We just need to loop until the fast pointer reaches or goes beyond linkedlist's end
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}