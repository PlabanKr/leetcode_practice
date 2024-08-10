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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack();
        ListNode temp = head;
        while(temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode ansHead = null;
        while(!st.isEmpty()) {
            ListNode node = new ListNode(st.pop(), null);
            if(ansHead != null) {
                temp.next = node;
                temp = temp.next;
            } else {
                ansHead = node;
                temp = ansHead;
            }
        }
        return ansHead;
    }
}