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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
    // Set both equal to head of their respective lists
    ListNode current1 = list1;
    ListNode current2 = list2;

    // Initialize a dummy pointer and finalList linked list 
    ListNode dummy = new ListNode(-1);
    ListNode finalList = dummy;

    // While there are nodes to traverse in each linked list
    while (current1 != null && current2 != null)
    {
        // If value in list 1 is less than or equal to value in list 2, then set list1.next = list2 current node
        if (current1.val <= current2.val)
        {
            finalList.next = current1;
            current1 = current1.next;
        }
        else // Else, value in list 2 is less than value in list 1, then set list2.next = list2 current node
        {
            finalList.next = current2;
            current2 = current2.next;
        }
        // Walk the linked list
        finalList = finalList.next;
    }

    // Add remaining leftover values from either list 1 or 2
    if (current1 != null)
    {
        finalList.next = current1;
    }
    else
    {
        finalList.next = current2;

    }
    
    return dummy.next;
    }
}