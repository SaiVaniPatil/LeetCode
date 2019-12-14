/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
       return  addTwoNumberswithCarry(l1,l2,0);
        
    }
    
    public ListNode addTwoNumberswithCarry(ListNode l1, ListNode l2, int carry)
    {
         ListNode newhead;        
        if(l1==null&&l2==null){           
            if(carry!=0){return new  ListNode(1);}
            return null;
        }
       int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val)+carry;
        int add = sum %10;
        carry = sum /10;
        newhead = new ListNode(add);
        
       if(l1==null){newhead.next = addTwoNumberswithCarry(l1,l2.next,carry); }
        else if(l2==null){newhead.next = addTwoNumberswithCarry(l1.next,l2,carry);}               
        else{newhead.next = addTwoNumberswithCarry(l1.next,l2.next,carry);}
            
        return newhead;
      
        
    }
    
    
}