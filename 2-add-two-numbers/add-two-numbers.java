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
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode temp1 = l1 , temp2 = l2 , temp = l1;
        int carry = 0 , n = 0 , c = 0;

        while(temp1 != null && temp2 != null)
        {
            temp = temp1;
            n = (temp1.val+temp2.val+carry);
            if(n >= 10)
                carry = 1;
            else
                carry = 0;
            temp.val = n % 10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null)
        {
            temp = temp1;
            n = (temp1.val+carry);
            if(n >= 10)
                carry = 1;
            else
                carry = 0;
            temp.val = n % 10;
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            if(c == 0)
            {
                c = 1;
                temp.next = temp2;
            }
            temp = temp2;
            n = (temp2.val+carry);
            if(n >= 10)
                carry = 1;
            else
                carry = 0;
            temp.val = n % 10;
            temp2 = temp2.next;
        }
        if(carry > 0)
        {
            temp.next = new ListNode(carry);
            temp = temp.next;
            temp.next = null;
        }
        return l1;
    }
}