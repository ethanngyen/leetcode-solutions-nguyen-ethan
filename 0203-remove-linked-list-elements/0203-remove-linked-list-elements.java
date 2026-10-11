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
    public ListNode removeElements(ListNode head, int val) {
        
        // Define "dummy" and "current" node to traverse through the array
        // dummy.next = head
        ListNode dummy = new ListNode(-1, head);

        // Current is now the head before the dummy
        ListNode current = dummy;

        // Check if the list is not empty
        if (head == null)
        {
            return head;
        }
        
        // While there is a next node
        while (current.next != null)
        {
            // Check if the next node is equal to val
            if (current.next.val == val)
            {
                // If the next node is equal to value, set next equal to next.next
                current.next = current.next.next;
            }
            else
            {   
                // If not, walk to the next node
                current = current.next;
            }
        }

        return dummy.next;
    }
}