/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode currentNode =head;
        ListNode headNode =head;
        while(currentNode!=null)
        {
            if(currentNode.next!=null && currentNode.val == currentNode.next.val)
            {
                ListNode tempNode = currentNode.next.next;
                currentNode.next = tempNode;
            }
            else
            {
                currentNode =currentNode.next;
            }
            
        }
        return headNode;
        
    }
}