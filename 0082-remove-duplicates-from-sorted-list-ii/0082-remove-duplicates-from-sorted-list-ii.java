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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        Map<Integer, Integer> map = new TreeMap<>();
        while(temp != null){
           map.put(temp.val, map.getOrDefault(temp.val,0)+1);
           temp = temp.next;
        }
        System.out.println(map);
        ListNode newHead = new ListNode(0);
        ListNode t = newHead;
       
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
            if(entry.getValue()==1){
               ListNode st = new ListNode(entry.getKey());
               t.next = st;
               t = st;
            }
        }
        return newHead.next;
    }
}