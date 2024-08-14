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
public class Solution {
    // Time complexity is O(n+m) and space complexity is O(n)
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     Set<ListNode> nodes = new HashSet<>();
    //     // we need to check the intersecting node based on the memory addr not on the value of node
    //     while(headA != null) {
    //         nodes.add(headA);
    //         headA = headA.next;
    //     }
    //     while(headB != null) {
    //         if(nodes.contains(headB)) {
    //             return headB;
    //         }
    //         headB = headB.next;
    //     }
    //     return null;
    // }

    // Optimal Approach
    // Intuition is to traverse through the linked lists and change the pointer to the other linkedlist head 
    // when they reach to null (end of the list), in this way the pointers will have to traverse the length
    // difference of the lists and eventually come at the same index, if both of them reach the same node
    // then we have our answer or if the both of the pointer reach null at same time then we do not have any
    // intersection.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA, tempB = headB;
        while(tempA != null || tempB != null) {
            if(tempA != null) {
                if(tempA.equals(tempB)) {
                    return tempA;
                }
                tempA = tempA.next;
            } else {
                tempA = headB;
            }
            if(tempB != null) {
                tempB = tempB.next;
            } else {
                tempB = headA;
            }
        }
        return null;
    }
}