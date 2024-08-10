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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = null;
        ListNode ansNext = new ListNode();
        ListNode p = list1;
        ListNode q = list2;

        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        while (p != null && q != null) {
            if (ans == null) {
                if (p.val < q.val) {
                    ListNode node = new ListNode(p.val);
                    ans = node;
                    ansNext = node;
                    p = p.next;
                } else {
                    ListNode node = new ListNode(q.val);
                    ans = node;
                    ansNext = node;
                    q = q.next;
                }
            } else {
                if (p.val < q.val) {
                    ListNode node = new ListNode(p.val);
                    ansNext.next = node;
                    ansNext = node;
                    p = p.next;
                } else {
                    ListNode node = new ListNode(q.val);
                    ansNext.next = node;
                    ansNext = node;
                    q = q.next;
                }
            }
        }
        while (p != null) {
            ListNode node = new ListNode(p.val);
            ansNext.next = node;
            ansNext = node;
            p = p.next;
        }
        while (q != null) {
            ListNode node = new ListNode(q.val);
            ansNext.next = node;
            ansNext = node;
            q = q.next;
        }
        return ans;
    }
}