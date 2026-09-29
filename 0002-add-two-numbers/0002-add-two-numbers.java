/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // long num1 = 0;
        // long num2 = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while(l1!=null){
            s1.append(l1.val);
            l1 = l1.next;
        }
         while(l2!=null){
           s2.append(l2.val);
            l2 = l2.next;
        }
        s1.reverse();
        s2.reverse();
        // long n1 = Long.parseLong(s1.toString());
        // long n2 = Long.parseLong(s2.toString());
        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());

        System.out.println(n1);
        System.out.println(n2);

        // long n2 = 0;
        // while(num1 > 0){
        //     n1 = (n1*10) + num1%10;
        //     num1 /= 10;
        // }
        // while(num2 > 0){
        //     n2 = (n2*10) + num2%10;
        //     num2 /= 10;
        // }
        // System.out.println(n1);
        // System.out.println(n2);
        BigInteger r = n1.add(n2);
       
        System.out.println(r);
    
        ListNode head = new ListNode(0);
       
        ListNode temp = head;
        BigInteger d = new BigInteger("10");
        System.out.println(r);
        while(r.signum()>0){
            int digit = (r.remainder(d)).intValueExact();
            temp.val = digit;
            if(r.compareTo(BigInteger.TEN)<0){
                break;
            }
            ListNode l = new ListNode();
            temp.next = l;
            temp = l;
            r = r.divide(d);
            System.out.println(1);

        }
        return head;
    }
}