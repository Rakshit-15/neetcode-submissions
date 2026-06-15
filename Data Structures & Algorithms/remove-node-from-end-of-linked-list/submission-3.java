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
    public ListNode removeNthFromEnd(ListNode head, int n) {

      //slow fast pinter
      // where we first move the fast pointer by n steps and
      //set fast there and slow at head to make sure n gap is maintened.

      ListNode slow=head;
      ListNode fast=head;

      for(int i=1;i<=n;i++){
        
           fast=fast.next;
        
      }
       if(fast==null ) return head.next;

      while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
      }

      ListNode delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;

    }
}
