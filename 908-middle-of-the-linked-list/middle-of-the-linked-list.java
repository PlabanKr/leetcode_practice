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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int midPos = (size / 2) + 1;
        int counter = 0;
        while(temp != null) {
            counter++;
            if(counter == midPos) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}