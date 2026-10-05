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
    public ListNode reverseList(ListNode head) {
        ListNode temp;
       if(head != null){
        temp = new ListNode(head.val);
        // temp.val = head.val;
        head = head.next;
       }
       else{
        return head;
       }
        while(head != null){
           ListNode nNode = new ListNode(head.val);
           nNode.next = temp;
           temp = nNode;
           head = head.next;
        }
        return temp;
    }
}