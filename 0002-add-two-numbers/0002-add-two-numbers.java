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
//  import java.math.BigInteger;
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         StringBuilder s1 = new StringBuilder();
//         StringBuilder s2 = new StringBuilder();

//         while(l1!=null){
//             s1.append(l1.val);
//             l1 = l1.next;
//         }
//          while(l2!=null){
//            s2.append(l2.val);
//             l2 = l2.next;
//         }
//         System.out.println(s1);
//         System.out.println(s2);
//         s1.reverse();
//         s2.reverse();
//         BigInteger n1 = new BigInteger(s1.toString());
//         BigInteger n2 = new BigInteger(s2.toString());

//         System.out.println(n1);
//         System.out.println(n2);

//         BigInteger r = n1.add(n2);
//         ListNode head = new ListNode(0);
//         ListNode temp = head;
//         BigInteger d = new BigInteger("10");
//         System.out.println(r);
//         while(r.signum()>0){
//             int digit = (r.remainder(d)).intValueExact();
//             temp.val = digit;
//             if(r.compareTo(BigInteger.TEN)<0){
//                 break;
//             }
//             ListNode l = new ListNode();
//             temp.next = l;
//             temp = l;
//             r = r.divide(d);
//             // System.out.println(1);
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        System.out.println(s1);
        System.out.println(s2);
        s1.reverse();
        s2.reverse();

        ListNode head = new ListNode(0);
        ListNode temp = head;
        int c = 0;
        while(s1.length()>0 && s2.length()>0){
            int c1 = s1.charAt(s1.length()-1) - '0';
            int c2 = s2.charAt(s2.length()-1) - '0';
            int r = c1+c2+c;
            if(r>=10){
                c = r/10;
                r = r%10;
            }
            else{
                c = 0;
            }
            // System.out.println(r);
            temp.val = r;
            if(s1.length() != 1 && s2.length() !=1){
                ListNode l = new ListNode();
                temp.next = l;
                temp = l;
            }
            s1.deleteCharAt(s1.length()-1);
            s2.deleteCharAt(s2.length()-1);
        }
        StringBuilder s = new StringBuilder("");
        if(s1.length()>0){
            s = new StringBuilder(s1);
            // System.out.println(s+" s1");
        }
        else if(s2.length()>0){
            s = new StringBuilder(s2);
            // System.out.println(s);
        }
        while(s.length()>0){
            // System.out.println(s);
            int ch = s.charAt(s.length()-1) - '0' + c;
            // System.out.println(ch);

            if(ch>=10){
                c = ch/10;
                ch = ch%10;
            }
            else{
                c = 0;
            }
            ListNode l = new ListNode(ch);
            temp.next = l;
            temp = l;
            s.deleteCharAt(s.length()-1);
        }
        if(c!=0){
            ListNode l = new ListNode(c);
            temp.next = l;
        }
        return head;
    }
}