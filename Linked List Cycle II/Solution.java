/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> cycleCheck = new HashSet<ListNode>();
        ListNode currNode =head;
        while(currNode!=null)
        {
            if(cycleCheck.contains(currNode))
            {
                return currNode;
            }
            else
            {
                cycleCheck.add(currNode);
                currNode= currNode.next;
            }
        }
        
        return null;
    }
}