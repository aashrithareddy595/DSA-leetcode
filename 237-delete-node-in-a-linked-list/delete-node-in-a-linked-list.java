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
        //node val is overwritten as the next node val and after that, point node's next to its nexxt next val so that we can skip that node and so that the node is deleted.
        node.val = node.next.val;
        node.next = node.next.next;
    }
}