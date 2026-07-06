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
    public void reorderList(ListNode head) {

        ListNode mid=findMid(head);
         ListNode second=mid.next;
         mid.next=null;
        ListNode revHead=rev(second);
         mergeTwoList(head,revHead);
         
             ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }      
    }

    ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    ListNode mergeTwoList(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        boolean flag=false;

        while(list1!=null && list2!=null){
            
            if(flag == false){
            tail.next=list1;
            list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
            flag=!flag;           
        }
        if(list1 !=null){
            tail.next=list1;
        }
        if(list2 != null){
            tail.next=list2;
        }

        return dummy.next;
    }
}
