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

    public ListNode reverse(ListNode head){

       ListNode curr= head;
       ListNode prev =null;
       while(curr != null){
        ListNode nextNode = curr.next;
        curr.next = prev ;
        prev = curr;
        curr = nextNode;
       }
       return prev;
    }
     
   public ListNode getKthNode(int k , ListNode temp){

           k--;
           while(temp !=null && k > 0){
            temp=temp.next;
            k--;
           }
         return temp;
   }
  
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k == 1) return head;

           ListNode temp=head,prevGroupTail=null,nextNode=null;

           while(temp!=null){
            ListNode kthNode = getKthNode(k,temp);

            if(kthNode == null) break;

            nextNode = kthNode.next;
            kthNode.next=null;

            ListNode newHead = reverse(temp);

            if(temp == head) head=newHead;
            else prevGroupTail.next = newHead; 

            prevGroupTail = temp;
            temp.next = nextNode;
            temp = nextNode;
           }
       return head;
    }
}
